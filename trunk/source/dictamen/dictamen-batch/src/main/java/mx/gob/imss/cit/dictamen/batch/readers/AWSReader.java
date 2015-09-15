package mx.gob.imss.cit.dictamen.batch.readers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

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

	@PostConstruct
	public void init() throws IOException{
		AWSCredentialsProvider credentials = null;
		lineas = new ArrayList<String>();
	    credentials = new ClasspathPropertiesFileCredentialsProvider();
		AmazonS3 s3 = new AmazonS3Client(credentials);
		ResourceBundle labels = ResourceBundle.getBundle("spring/batch/properties/configuration");
		bucketName = labels.getString("aws.bucket");
		LOG.info("Request object: "+key);
		S3Object object = s3.getObject(new GetObjectRequest(bucketName, key));
        BufferedReader reader = new BufferedReader(new InputStreamReader(object.getObjectContent()));
        while (true) {
        	String line = reader.readLine();                
        	if (line == null) break;        	
        	lineas.add(line);        	
        }
	}

	@Override
	public String read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if (index < lineas.size()) {
            String str = lineas.get(index++);
            LOG.info(str);
            return str;
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
	
}

