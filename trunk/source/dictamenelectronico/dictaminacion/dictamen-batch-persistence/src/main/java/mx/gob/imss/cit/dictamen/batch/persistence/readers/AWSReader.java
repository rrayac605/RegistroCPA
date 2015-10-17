package mx.gob.imss.cit.dictamen.batch.persistence.readers;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class AWSReader implements ItemReader<String> {
	private Logger LOG=Logger.getLogger(AWSReader.class);
	private List<String> lineas;
	private int index;
	private String key;
	private String bucketName;
	private String destino;
	private String rutaAWSCredentials;

	@PostConstruct
	public void init() throws IOException{

		LOG.info("Request object: "+key);

	}

	@Override
	public String read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if (index < lineas.size()) {            
            return lineas.get(index++);
        } else {
            return null;
        }
	}

	public List<String> getLineas() {
		return lineas;
	}

	public void setLineas(List<String> lineas) {
		this.lineas = lineas;
	}
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getRutaAWSCredentials() {
		return rutaAWSCredentials;
	}

	public void setRutaAWSCredentials(String rutaAWSCredentials) {
		this.rutaAWSCredentials = rutaAWSCredentials;
	}
	
}

