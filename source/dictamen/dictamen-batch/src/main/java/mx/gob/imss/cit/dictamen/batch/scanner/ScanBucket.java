package mx.gob.imss.cit.dictamen.batch.scanner;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.S3ObjectSummary;

import mx.gob.imss.cit.dictamen.batch.constants.BatchAWSConstants;

@Component
public class ScanBucket {
	private Logger LOG=Logger.getLogger(ScanBucket.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private AmazonS3 s3;
        
    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;
    
    public ScanBucket(){
	  AWSCredentials credentials = null;
	  try {
		  credentials = new ProfileCredentialsProvider("default").getCredentials();
	  } catch (Exception e) {
		  throw new AmazonClientException(
			"Cannot load the credentials from the credential profiles file. " +
			"Please make sure that your credentials file is at the correct " +
			"location (C:\\Users\\admin\\.aws\\credentials), and is in valid format.",
			e);
	  }
	  s3 = new AmazonS3Client(credentials);
	}
	  
    public void run() {    	
	  JobParameters parameters;
	  String keyDestination;
	  for (S3ObjectSummary object1 : s3.listObjects(BatchAWSConstants.BUCKET_NAME).getObjectSummaries()) {    		
		  if (object1.getKey().startsWith("Dictamen") && object1.getKey().endsWith(".txt") && object1.getKey().contains("aseveraciones")){
			  try {
				  LOG.info("Objeto a procesar: "+object1.getKey());
				  keyDestination=object1.getKey().replaceFirst("Dictamen", "Proceso");
				  moveObject(object1.getKey(), keyDestination);
				  LOG.info("Destino: "+keyDestination);    				
				  JobParametersBuilder parametersBuilder = new JobParametersBuilder();
				  parametersBuilder.addString("key", keyDestination).toJobParameters();
				  parametersBuilder.addString("date", new Date().toString());
				  parameters = parametersBuilder.toJobParameters();
				  JobExecution execution = jobLauncher.run(job, parameters);
				  LOG.info("Exit Status : " + execution.getStatus());
			  } catch (Exception e) {
				  e.printStackTrace();
			  }
		  }
	  }
	  LOG.info("The time is now " + dateFormat.format(new Date()));
    }
	  
    public void moveObject(String key, String destinationKey){
	  try {
		  // Copying object
		  CopyObjectRequest copyObjRequest = new CopyObjectRequest(
				  BatchAWSConstants.BUCKET_NAME, key, BatchAWSConstants.BUCKET_NAME, destinationKey);
		  LOG.info("Copying object.");
		  s3.copyObject(copyObjRequest);
		  LOG.info("Deleting object.");
		  s3.deleteObject(new DeleteObjectRequest(BatchAWSConstants.BUCKET_NAME, key));
	  } catch (AmazonServiceException ase) {
		  LOG.error("Caught an AmazonServiceException, " +
        		"which means your request made it " + 
        		"to Amazon S3, but was rejected with an error " +
                "response for some reason.");
		  LOG.error("Error Message:    " + ase.getMessage());
		  LOG.error("HTTP Status Code: " + ase.getStatusCode());
		  LOG.error("AWS Error Code:   " + ase.getErrorCode());
		  LOG.error("Error Type:       " + ase.getErrorType());
		  LOG.error("Request ID:       " + ase.getRequestId());
	  } catch (AmazonClientException ace) {
		  LOG.error("Caught an AmazonClientException, " +
        		"which means the client encountered " +
                "an internal error while trying to " +
                " communicate with S3, " +
                "such as not being able to access the network.");
		  LOG.error("Error Message: " + ace.getMessage());
	  }    	
    }
}

