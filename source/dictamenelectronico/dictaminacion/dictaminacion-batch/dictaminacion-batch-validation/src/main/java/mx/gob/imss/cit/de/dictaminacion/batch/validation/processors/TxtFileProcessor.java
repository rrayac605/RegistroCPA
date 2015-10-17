package mx.gob.imss.cit.de.dictaminacion.batch.validation.processors;

import org.springframework.batch.item.ItemProcessor;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.enums.BatchValidationsEnum;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.A1TO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.util.Validator;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class TxtFileProcessor implements ItemProcessor<A1TO, A1TO> {

	@Override
	public A1TO process(A1TO paramI) throws Exception {
        if(Validator.validate(BatchValidationsEnum.OBLIGATORIO, paramI.getRegPatronal())){
            
        }else{
            
        } 
		return paramI;
	}

}

