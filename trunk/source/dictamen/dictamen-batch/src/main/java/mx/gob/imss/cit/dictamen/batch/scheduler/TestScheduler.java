package mx.gob.imss.cit.dictamen.batch.scheduler;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScheduler {
	
  public static void main(String[] args) {

	String springConfig = "spring/batch/jobs/job-report.xml";

	ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

  }
}

