package mx.gob.imss.cit.de.dictaminacion.batch.validation.validators;

import java.util.Date;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.enums.BatchMensajesEnum;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.enums.BatchValidationsEnum;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.A2TO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.BitacoraErroresTO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.util.Mensajes;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.util.Validator;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class A2Validator {
	public static BitacoraErroresTO validateA2(A2TO a2TO){
		BitacoraErroresTO bitacoraErroresTO = new BitacoraErroresTO();
		String desErrores = "";
		bitacoraErroresTO = new BitacoraErroresTO();
		bitacoraErroresTO.setFecRegistroActualizado(new Date());
		bitacoraErroresTO.setFecRegistroAlta(new Date());
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a2TO.getImpInstrumentosTrabajo())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a2TO.getLineNumber(), "ImpInstrumentosTrabajo"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a2TO.getImpInstrumentosTrabajo())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a2TO.getLineNumber(), "ImpInstrumentosTrabajo",4,21));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a2TO.getImpGastosPrevisionSocial())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a2TO.getLineNumber(), "ImpGastosPrevisionSocial"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a2TO.getImpGastosPrevisionSocial())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a2TO.getLineNumber(), "ImpGastosPrevisionSocial",4,21));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a2TO.getImpAlimentacion())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a2TO.getLineNumber(), "ImpAlimentacion"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a2TO.getImpAlimentacion())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a2TO.getLineNumber(), "ImpAlimentacion",4,21));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a2TO.getImpHabitacion())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a2TO.getLineNumber(), "ImpHabitacion"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a2TO.getImpHabitacion())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a2TO.getLineNumber(), "ImpHabitacion",4,21));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a2TO.getImpAportacionAdicionalRcv())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a2TO.getLineNumber(), "ImpAportacionAdicionalRcv"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a2TO.getImpAportacionAdicionalRcv())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a2TO.getLineNumber(), "ImpAportacionAdicionalRcv",4,21));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a2TO.getImpCuotaObrera())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a2TO.getLineNumber(), "ImpCuotaObrera"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a2TO.getImpCuotaObrera())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a2TO.getLineNumber(), "ImpCuotaObrera",4,21));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a2TO.getImpCuotaPatronalInfonavit())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a2TO.getLineNumber(), "ImpCuotaPatronalInfonavit"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a2TO.getImpCuotaPatronalInfonavit())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a2TO.getLineNumber(), "ImpCuotaPatronalInfonavit",4,21));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a2TO.getImpFondoPensiones())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a2TO.getLineNumber(), "ImpFondoPensiones"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a2TO.getImpFondoPensiones())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a2TO.getLineNumber(), "ImpFondoPensiones",4,21));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a2TO.getImpOtrasPrestaciones())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a2TO.getLineNumber(), "ImpOtrasPrestaciones"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a2TO.getImpOtrasPrestaciones())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a2TO.getLineNumber(), "ImpOtrasPrestaciones",4,21));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a2TO.getImpTotal())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a2TO.getLineNumber(), "ImpTotal"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a2TO.getImpTotal())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a2TO.getLineNumber(), "ImpTotal",4,21));
		}		
		
		if(desErrores.length()>=3000){
			desErrores = desErrores.substring(0, 2999);
		}
		bitacoraErroresTO.setDesErrores(desErrores);
		return bitacoraErroresTO;	
	}
}

