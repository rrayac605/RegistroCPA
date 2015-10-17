package mx.gob.imss.cit.de.dictaminacion.batch.validation.scheduler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunScheduler {
	
	 private static Logger LOG=Logger.getLogger(RunScheduler.class);
	
  public static void main(String[] args) throws FileNotFoundException, IOException {
	  ConfigurableApplicationContext context = null;
	 
	  
	  try{
		  Properties p = new Properties();	  	  
		  ResourceBundle labels = ResourceBundle.getBundle("spring/batch/properties/configuration");
		  PropertyConfigurator.configure(p.getClass().getResource(labels.getString("configuracion.log4j.file")));
				
		  String springConfig = "spring/batch/jobs/job-report.xml";    
		  context = new ClassPathXmlApplicationContext(springConfig);	  
		  context.start();
	  }catch (Exception e){
		  LOG.error(e.getMessage(), e);
		  if(context!=null){
			  context.close();
		  }
		 
	  }
  }
}

