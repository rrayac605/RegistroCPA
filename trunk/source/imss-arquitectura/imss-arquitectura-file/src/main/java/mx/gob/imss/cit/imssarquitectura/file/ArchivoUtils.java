package mx.gob.imss.cit.imssarquitectura.file;

import java.io.File;
import java.util.ArrayList;

import mx.gob.imss.cit.imssarquitectura.file.constants.ArchivoConstants;
import mx.gob.imss.cit.imssarquitectura.file.exception.ArquitecturaFileException;
import mx.gob.imss.cit.imssarquitectura.file.to.DividirArchivoAESTO;
import mx.gob.imss.cit.imssarquitectura.file.to.DividirArchivoTO;
import mx.gob.imss.cit.imssarquitectura.file.to.DividirArchivosAESTO;
import mx.gob.imss.cit.imssarquitectura.file.to.DividirArchivosTO;
import mx.gob.imss.cit.imssarquitectura.file.to.ExtraerArchivosAESTO;
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
			
			zipFile.createZipFile(filesToAdd, parameters, ArchivoConstants.DIVIDIR, dividirArchivo.getLongitudDivision());		
		} catch (ZipException e) {
			throw new ArquitecturaFileException(e.getMessage(), e);		
		}
	}
	
	public static void dividirArchivoUnicoAES(DividirArchivoAESTO dividirArchivoAES){
		try {
			File archivoOrigen = new File(dividirArchivoAES.getNombreOrigen());
			ZipFile zipFile = new ZipFile(dividirArchivoAES.getNombreDestino());
			ArrayList<File> filesToAdd = new ArrayList<File>();
			filesToAdd.add(archivoOrigen);

			ZipParameters parameters = new ZipParameters();
			parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
			parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
			parameters.setEncryptFiles(ArchivoConstants.CIFRAR);
			parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);
			parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
			parameters.setPassword(dividirArchivoAES.getContrasenia());
			
			zipFile.createZipFile(filesToAdd, parameters, ArchivoConstants.DIVIDIR, dividirArchivoAES.getLongitudDivision());		
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
			
			zipFile.createZipFile(filesToAdd, parameters, ArchivoConstants.DIVIDIR, dividirArchivos.getLongitudDivision());		
		} catch (ZipException e) {
			throw new ArquitecturaFileException(e.getMessage(), e);		
		}		
	}
	
	public static void dividirArchivos(DividirArchivosAESTO dividirArchivosAES){
		try {
			ZipFile zipFile = new ZipFile(dividirArchivosAES.getNombreDestino());
			ArrayList<File> filesToAdd = new ArrayList<File>();
			for(String nombreOrigen: dividirArchivosAES.getNombresOrigen()){
				filesToAdd.add(new File(nombreOrigen));	
			}			

			ZipParameters parameters = new ZipParameters();
			parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
			parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
			parameters.setEncryptFiles(ArchivoConstants.CIFRAR);
			parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);
			parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
			parameters.setPassword(dividirArchivosAES.getContrasenia());
			
			zipFile.createZipFile(filesToAdd, parameters, ArchivoConstants.DIVIDIR, dividirArchivosAES.getLongitudDivision());		
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
	
	public static void extraerArchivosAES(ExtraerArchivosAESTO extraerArchivosAES){
		try {
			ZipFile zipFile = new ZipFile(extraerArchivosAES.getNombreArchivo());
			zipFile.setPassword(extraerArchivosAES.getContrasenia());		
			zipFile.extractAll(extraerArchivosAES.getRutaDestino());	
		} catch (ZipException e) {
			throw new ArquitecturaFileException(e.getMessage(), e);
		}
	}	
}

