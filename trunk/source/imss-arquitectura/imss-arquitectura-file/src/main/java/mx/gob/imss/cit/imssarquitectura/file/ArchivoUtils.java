package mx.gob.imss.cit.imssarquitectura.file;

import java.io.File;
import java.util.ArrayList;

import mx.gob.imss.cit.imssarquitectura.file.constants.ArchivoConstants;
import mx.gob.imss.cit.imssarquitectura.file.exception.ArquitecturaFileException;
import mx.gob.imss.cit.imssarquitectura.file.to.DividirArchivoTO;
import mx.gob.imss.cit.imssarquitectura.file.to.DividirArchivosTO;
import mx.gob.imss.cit.imssarquitectura.file.to.ExtraerArchivosTO;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class ArchivoUtils {
	
	public static void dividirArchivoUnico(DividirArchivoTO dividirArchivo){
		try {
			File archivoOrigen = new File(dividirArchivo.getNombreOrigen());
			ZipFile zipFile = new ZipFile(dividirArchivo.getNombreDestino());
			ArrayList<File> filesToAdd = new ArrayList<File>();
			filesToAdd.add(archivoOrigen);

			ZipParameters parameters = new ZipParameters();
			parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
			parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
			
			zipFile.createZipFile(filesToAdd, parameters, ArchivoConstants.SPLIT, dividirArchivo.getLongitudDivision());		
		} catch (ZipException e) {
			throw new ArquitecturaFileException(e.getMessage(), e);		
		}
	}
	
	public static void dividirArchivos(DividirArchivosTO dividirArchivos){
		try {
			ZipFile zipFile = new ZipFile(dividirArchivos.getNombreDestino());
			ArrayList<File> filesToAdd = new ArrayList<File>();
			for(String nombreOrigen: dividirArchivos.getNombresOrigen()){
				filesToAdd.add(new File(nombreOrigen));	
			}			

			ZipParameters parameters = new ZipParameters();
			parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
			parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
			
			zipFile.createZipFile(filesToAdd, parameters, ArchivoConstants.SPLIT, dividirArchivos.getLongitudDivision());		
		} catch (ZipException e) {
			throw new ArquitecturaFileException(e.getMessage(), e);		
		}		
	}
	
	public static void extraerArchivos(ExtraerArchivosTO extraerArchivos){
		try {
			ZipFile zipFile = new ZipFile(extraerArchivos.getNombreArchivo());			
			zipFile.extractAll(extraerArchivos.getRutaDestino());			
		} catch (ZipException e) {
			throw new ArquitecturaFileException(e.getMessage(), e);
		}		
	}
}

