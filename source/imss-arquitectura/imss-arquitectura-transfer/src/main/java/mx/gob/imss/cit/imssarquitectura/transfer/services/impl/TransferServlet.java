package mx.gob.imss.cit.imssarquitectura.transfer.services.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.imssarquitectura.transfer.constants.TransferServletConstants;
import mx.gob.imss.cit.imssarquitectura.transfer.exception.TransferServletException;
import mx.gob.imss.cit.imssarquitectura.transfer.services.Transfer;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class TransferServlet implements Transfer {
	private Logger LOG=Logger.getLogger(TransferServlet.class);

	@Override
	public void subirArchivoUnico(String nombreArchivo) {
        File uploadFile = new File(nombreArchivo);
        
        LOG.info("Archivo a subir: " + nombreArchivo);
        try {
        // creates a HTTP connection
        URL url = new URL(TransferServletConstants.URL);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        httpConn.setUseCaches(TransferServletConstants.USE_CACHE);
        httpConn.setDoOutput(TransferServletConstants.DO_OUTPUT);
        httpConn.setRequestMethod(TransferServletConstants.REQUEST_METHOD);
        // sets REQUEST_PROPERTY as a HTTP header
        httpConn.setRequestProperty(TransferServletConstants.REQUEST_PROPERTY, uploadFile.getName());
 
        OutputStream outputStream;
        outputStream = httpConn.getOutputStream();
 
        FileInputStream inputStream;
        inputStream = new FileInputStream(uploadFile);
 
        byte[] buffer = new byte[TransferServletConstants.BUFFER_SIZE];
        int bytesRead;
        bytesRead = -1;
 
        LOG.info("Escribiendo archivo...");
 
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
 
        LOG.info("El archivo se termino de escribir.");
        outputStream.close();
        inputStream.close();
 
        // always check HTTP response code from server
        int responseCode = httpConn.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            // reads server's response
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    httpConn.getInputStream()));
            String response = reader.readLine();
            LOG.info("Respuesta del servidor: " + response);
        } else {
        	LOG.info("Error en el servidor: " + responseCode);
        }	
        }catch (MalformedURLException e) {
        	throw new TransferServletException(e.getMessage(), e);
		} catch (ProtocolException e) {
			throw new TransferServletException(e.getMessage(), e);
		} catch (IOException e) {
			throw new TransferServletException(e.getMessage(), e);
		}
	}

	@Override
	public void subirArchivos(String[] nombresArchivos) {
		// TODO Auto-generated method stub

	}

}

