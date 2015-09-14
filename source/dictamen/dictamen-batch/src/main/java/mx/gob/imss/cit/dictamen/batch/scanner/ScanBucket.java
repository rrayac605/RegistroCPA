package mx.gob.imss.cit.dictamen.batch.scanner;

import java.text.SimpleDateFormat;
import java.util.Date;

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
				  System.out.println(object1.getKey());
				  keyDestination=object1.getKey().replaceFirst("Dictamen", "Proceso");
				  moveObject(object1.getKey(), keyDestination);
				  System.out.println(keyDestination);    				
				  JobParametersBuilder parametersBuilder = new JobParametersBuilder();
				  parametersBuilder.addString("key", keyDestination).toJobParameters();
				  parametersBuilder.addString("date", new Date().toString());
				  parameters = parametersBuilder.toJobParameters();
				  JobExecution execution = jobLauncher.run(job, parameters);
				  System.out.println("Exit Status : " + execution.getStatus());
			  } catch (Exception e) {
				  e.printStackTrace();
			  }
		  }
	  }
	  System.out.println("The time is now " + dateFormat.format(new Date()));
    }
	  
    public void moveObject(String key, String destinationKey){
	  try {
		  // Copying object
		  CopyObjectRequest copyObjRequest = new CopyObjectRequest(
				  BatchAWSConstants.BUCKET_NAME, key, BatchAWSConstants.BUCKET_NAME, destinationKey);
		  System.out.println("Copying object.");
		  s3.copyObject(copyObjRequest);
		  System.out.println("Deleting object.");
		  s3.deleteObject(new DeleteObjectRequest(BatchAWSConstants.BUCKET_NAME, key));
	  } catch (AmazonServiceException ase) {
		  System.out.println("Caught an AmazonServiceException, " +
        		"which means your request made it " + 
        		"to Amazon S3, but was rejected with an error " +
                "response for some reason.");
		  System.out.println("Error Message:    " + ase.getMessage());
		  System.out.println("HTTP Status Code: " + ase.getStatusCode());
		  System.out.println("AWS Error Code:   " + ase.getErrorCode());
		  System.out.println("Error Type:       " + ase.getErrorType());
		  System.out.println("Request ID:       " + ase.getRequestId());
	  } catch (AmazonClientException ace) {
		  System.out.println("Caught an AmazonClientException, " +
        		"which means the client encountered " +
                "an internal error while trying to " +
                " communicate with S3, " +
                "such as not being able to access the network.");
		  System.out.println("Error Message: " + ace.getMessage());
	  }    	
    }
}

