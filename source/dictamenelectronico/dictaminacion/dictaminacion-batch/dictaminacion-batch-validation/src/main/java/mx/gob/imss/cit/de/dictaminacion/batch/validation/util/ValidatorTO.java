package mx.gob.imss.cit.de.dictaminacion.batch.validation.util;

import java.util.Date;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.enums.BatchMensajesEnum;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.enums.BatchValidationsEnum;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.A1TO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.BitacoraErroresTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class ValidatorTO {
	public static BitacoraErroresTO validateA1(A1TO a1TO){
		BitacoraErroresTO bitacoraErroresTO = new BitacoraErroresTO();
		String desErrores = "";
		bitacoraErroresTO = new BitacoraErroresTO();
		bitacoraErroresTO.setFecRegistroActualizado(new Date());
		bitacoraErroresTO.setFecRegistroAlta(new Date());
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_1, a1TO.getRegPatronal())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_4, a1TO.getLineNumber(), "RegPatronal"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_2, a1TO.getRegPatronal())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_1, a1TO.getLineNumber(), "RegPatronal",11));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_3, a1TO.getRegPatronal())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "RegPatronal"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_1, a1TO.getNomPrimerApellidoTrabajador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_4, a1TO.getLineNumber(), "NomPrimerApellidoTrabajador"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_4, a1TO.getNomPrimerApellidoTrabajador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_3, a1TO.getLineNumber(), "NomPrimerApellidoTrabajador", 50));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_5, a1TO.getNomPrimerApellidoTrabajador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "NomPrimerApellidoTrabajador"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_4, a1TO.getNomSegundoApellidoTrabajador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_3, a1TO.getLineNumber(), "NomSegundoApellidoTrabajador", 50));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_5, a1TO.getNomSegundoApellidoTrabajador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "NomSegundoApellidoTrabajador"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_1, a1TO.getNomNombreTrabajador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_4, a1TO.getLineNumber(), "NomNombreTrabajador", 50));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_4, a1TO.getNomNombreTrabajador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_3, a1TO.getLineNumber(), "NomNombreTrabajador"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_5, a1TO.getNomNombreTrabajador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "NomNombreTrabajador"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_1, a1TO.getNumNssTrabajador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_4, a1TO.getLineNumber(), "NumNssTrabajador", 11));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_6, a1TO.getNumNssTrabajador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_1, a1TO.getLineNumber(), "NumNssTrabajador"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_7, a1TO.getNumNssTrabajador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "NumNssTrabajador"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_8, a1TO.getRfcTrabajador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_1, a1TO.getLineNumber(), "RfcTrabajador"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_9, a1TO.getRfcTrabajador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "RfcTrabajador"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_10, a1TO.getCurpTrabajador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_1, a1TO.getLineNumber(), "CurpTrabajador"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_3, a1TO.getCurpTrabajador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "CurpTrabajador"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpGratificaciones())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpGratificaciones"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpGratificaciones())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpGratificaciones"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpViaticos())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpViaticos"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpViaticos())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpViaticos"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpTiempoExtra())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpTiempoExtra"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpTiempoExtra())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpTiempoExtra"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpPrimaVacacional())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpPrimaVacacional"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpPrimaVacacional())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpPrimaVacacional"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpPrimaDominical())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpPrimaDominical"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpPrimaDominical())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpPrimaDominical"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpPtu())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpPtu"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpPtu())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpPtu"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpReembolsoGm())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpReembolsoGm"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpReembolsoGm())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpReembolsoGm"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpFondoAhorro())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpFondoAhorro"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpFondoAhorro())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpFondoAhorro"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpCajaAhorro())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpCajaAhorro"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpCajaAhorro())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpCajaAhorro"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpValesDespensa())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpValesDespensa"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpValesDespensa())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpValesDespensa"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpAyudaGf())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpAyudaGf"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpAyudaGf())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpAyudaGf"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpContribucionPatron())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpContribucionPatron"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpContribucionPatron())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpContribucionPatron"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpPremioPuntualidad())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpPremioPuntualidad"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpPremioPuntualidad())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpPremioPuntualidad"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpPremioAsistencia())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpPremioAsistencia"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpPremioAsistencia())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpPremioAsistencia"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpPrimaSeguroVida())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpPrimaSeguroVida"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpPrimaSeguroVida())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpPrimaSeguroVida"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpSeguroGmm())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpSeguroGmm"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpSeguroGmm())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpSeguroGmm"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpValesRestaurant())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpValesRestaurant"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpValesRestaurant())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpValesRestaurant"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpValesGasolina())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpValesGasolina"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpValesGasolina())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpValesGasolina"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpValesRopa())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpValesRopa"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpValesRopa())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpValesRopa"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpAyudaRenta())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpAyudaRenta"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpAyudaRenta())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpAyudaRenta"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpAyudaEscolar())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpAyudaEscolar"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpAyudaEscolar())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpAyudaEscolar"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpAyudaAnteojos())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpAyudaAnteojos"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpAyudaAnteojos())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpAyudaAnteojos"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpAyudaTransporte())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpAyudaTransporte"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpAyudaTransporte())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpAyudaTransporte"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpCuotaSindical())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpCuotaSindical"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpCuotaSindical())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpCuotaSindical"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpSubsidioIncapacidad())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpSubsidioIncapacidad"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpSubsidioIncapacidad())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpSubsidioIncapacidad"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpBecaTrabajadorHijo())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpBecaTrabajadorHijo"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpBecaTrabajadorHijo())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpBecaTrabajadorHijo"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpOtrosIngresosXsalario())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpOtrosIngresosXsalario"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpOtrosIngresosXsalario())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpOtrosIngresosXsalario"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpPagoOtroEmpleador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpPagoOtroEmpleador"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpPagoOtroEmpleador())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpPagoOtroEmpleador"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpJubPenRetiro())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpJubPenRetiro"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpJubPenRetiro())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpJubPenRetiro"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpOtrosPagosXseparacion())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpOtrosPagosXseparacion"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_12, a1TO.getImpOtrosPagosXseparacion())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_5, a1TO.getLineNumber(), "ImpOtrosPagosXseparacion"));
		}
		
		if(!Validator.validate(BatchValidationsEnum.VALIDACION_11, a1TO.getImpTotal())){
			desErrores=desErrores.concat(Mensajes.getMensaje(BatchMensajesEnum.MENSAJE_2, a1TO.getLineNumber(), "ImpTotal"));
		}
		if(desErrores.length()>=3000){
			desErrores = desErrores.substring(0, 2999);
		}
		bitacoraErroresTO.setDesErrores(desErrores);
		return bitacoraErroresTO;	
	}
}

