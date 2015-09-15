package mx.gob.imss.cit.dictamen.batch.readers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

import mx.gob.imss.cit.dictamen.batch.constants.BatchAWSConstants;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class AWSReader implements ItemReader<String> {
	private Logger LOG=Logger.getLogger(AWSReader.class);
	private List<String> aseveraciones;
	private int index;
	private String key;

	@PostConstruct
	public void init() throws IOException{
		AWSCredentialsProvider credentials = null;
		aseveraciones = new ArrayList<String>();
	    credentials = new ClasspathPropertiesFileCredentialsProvider();
		AmazonS3 s3 = new AmazonS3Client(credentials);
		LOG.info("Request object: "+key);
		S3Object object = s3.getObject(new GetObjectRequest(BatchAWSConstants.BUCKET_NAME, key));
        BufferedReader reader = new BufferedReader(new InputStreamReader(object.getObjectContent()));
        while (true) {
        	String line = reader.readLine();                
        	if (line == null) break;        	
        	aseveraciones.add(line);        	
        }
	}

	@Override
	public String read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if (index < aseveraciones.size()) {
            String str = aseveraciones.get(index++);
            LOG.info(str);
            return str;
        } else {
            return null;
        }
	}

	public List<String> getAseveraciones() {
		return aseveraciones;
	}

	public void setAseveraciones(List<String> aseveraciones) {
		this.aseveraciones = aseveraciones;
	}
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
}

