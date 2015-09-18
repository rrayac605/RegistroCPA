package mx.gob.imss.cit.dictamen.batch.scheduler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.log4j.PropertyConfigurator;
/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunScheduler {
	
  public static void main(String[] args) throws FileNotFoundException, IOException {
	  
	Properties p = new Properties();	  	  
	ResourceBundle labels = ResourceBundle.getBundle("spring/batch/properties/configuration");
	PropertyConfigurator.configure(p.getClass().getResource(labels.getString("configuracion.log4j.file")));
		
	String springConfig = "spring/batch/jobs/job-report.xml";    
	ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);	

  }
}

