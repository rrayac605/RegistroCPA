package mx.gob.imss.cit.de.dictaminacion.batch.validation.util;

import java.util.Date;
import java.util.ResourceBundle;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.JobParametersTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class JobParameterBuilderUtil {
	public static JobParameters buildJobParameters(JobParametersTO jobParametersTO){
		ResourceBundle labels = ResourceBundle.getBundle("spring/batch/properties/configuration");
		JobParametersBuilder parametersBuilder = new JobParametersBuilder();
		parametersBuilder.addString("origen", jobParametersTO.getOrigen());
		parametersBuilder.addString("destino", jobParametersTO.getDestino());
		parametersBuilder.addString("date", new Date().toString());
		parametersBuilder.addString("delay", jobParametersTO.getDelay());
		parametersBuilder.addString("fields", labels.getString("a"+jobParametersTO.getIdAseveracion()+".fields"));
		parametersBuilder.addString("prototype", labels.getString("a"+jobParametersTO.getIdAseveracion()+".prototype"));
		parametersBuilder.addString("query", labels.getString("a"+jobParametersTO.getIdAseveracion()+".query"));
		parametersBuilder.addLong("idAseveracion", jobParametersTO.getIdAseveracion());
		parametersBuilder.addLong("cveIdBitacoraCargaAsev", jobParametersTO.getCveIdBitacoraCargaAsev());
		parametersBuilder.addLong("cveIdPatronDictamen", jobParametersTO.getCveIdPatronDictamen());
		return parametersBuilder.toJobParameters();
	}
}

