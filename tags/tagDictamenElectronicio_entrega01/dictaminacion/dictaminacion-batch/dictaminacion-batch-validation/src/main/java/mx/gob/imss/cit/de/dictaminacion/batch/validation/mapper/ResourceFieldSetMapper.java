package mx.gob.imss.cit.de.dictaminacion.batch.validation.mapper;

import org.springframework.batch.item.file.transform.FieldSet;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.enums.BatchAseveracionesEnum;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.A1TO;
import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.A2TO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class ResourceFieldSetMapper {
	public Object mapFieldSet(FieldSet fieldSet, BatchAseveracionesEnum idAseveracion, int paramInt){
		switch (idAseveracion){
		case A1:		
			return mapFieldSetToA1(fieldSet, paramInt);
		case A2:
			return mapFieldSetToA2(fieldSet, paramInt);
		default:
			break;
		}
		return fieldSet;		
	}
	
	public A1TO mapFieldSetToA1(FieldSet fieldSet, int paramInt){
		A1TO a1TO = new A1TO();
		a1TO.setLineNumber(paramInt);
		a1TO.setRegPatronal(fieldSet.readString("regPatronal"));
		a1TO.setNomPrimerApellidoTrabajador(fieldSet.readString("nomPrimerApellidoTrabajador"));
		a1TO.setNomSegundoApellidoTrabajador(fieldSet.readString("nomSegundoApellidoTrabajador"));
		a1TO.setNomNombreTrabajador(fieldSet.readString("nomNombreTrabajador"));
		a1TO.setNumNssTrabajador(fieldSet.readString("numNssTrabajador"));
		a1TO.setRfcTrabajador(fieldSet.readString("rfcTrabajador"));
		a1TO.setCurpTrabajador(fieldSet.readString("curpTrabajador"));
		a1TO.setImpSueldosSalarios(fieldSet.readString("impSueldosSalarios"));
		a1TO.setImpGratificaciones(fieldSet.readString("impGratificaciones"));
		a1TO.setImpViaticos(fieldSet.readString("impViaticos"));
		a1TO.setImpTiempoExtra(fieldSet.readString("impTiempoExtra"));
		a1TO.setImpPrimaVacacional(fieldSet.readString("impPrimaVacacional"));
		a1TO.setImpPrimaDominical(fieldSet.readString("impPrimaDominical"));
		a1TO.setImpPtu(fieldSet.readString("impPtu"));
		a1TO.setImpReembolsoGm(fieldSet.readString("impReembolsoGm"));
		a1TO.setImpFondoAhorro(fieldSet.readString("impFondoAhorro"));
		a1TO.setImpCajaAhorro(fieldSet.readString("impCajaAhorro"));
		a1TO.setImpValesDespensa(fieldSet.readString("impValesDespensa"));
		a1TO.setImpAyudaGf(fieldSet.readString("impAyudaGf"));
		a1TO.setImpContribucionPatron(fieldSet.readString("impContribucionPatron"));
		a1TO.setImpPremioPuntualidad(fieldSet.readString("impPremioPuntualidad"));
		a1TO.setImpPremioAsistencia(fieldSet.readString("impPremioAsistencia"));
		a1TO.setImpPrimaSeguroVida(fieldSet.readString("impPrimaSeguroVida"));
		a1TO.setImpSeguroGmm(fieldSet.readString("impSeguroGmm"));
		a1TO.setImpValesRestaurant(fieldSet.readString("impValesRestaurant"));
		a1TO.setImpValesGasolina(fieldSet.readString("impValesGasolina"));
		a1TO.setImpValesRopa(fieldSet.readString("impValesRopa"));
		a1TO.setImpAyudaRenta(fieldSet.readString("impAyudaRenta"));
		a1TO.setImpAyudaEscolar(fieldSet.readString("impAyudaEscolar"));
		a1TO.setImpAyudaAnteojos(fieldSet.readString("impAyudaAnteojos"));
		a1TO.setImpAyudaTransporte(fieldSet.readString("impAyudaTransporte"));
		a1TO.setImpCuotaSindical(fieldSet.readString("impCuotaSindical"));
		a1TO.setImpSubsidioIncapacidad(fieldSet.readString("impSubsidioIncapacidad"));
		a1TO.setImpBecaTrabajadorHijo(fieldSet.readString("impBecaTrabajadorHijo"));
		a1TO.setImpOtrosIngresosXsalario(fieldSet.readString("impOtrosIngresosXsalario"));
		a1TO.setImpPagoOtroEmpleador(fieldSet.readString("impPagoOtroEmpleador"));
		a1TO.setImpJubPenRetiro(fieldSet.readString("impJubPenRetiro"));
		a1TO.setImpOtrosPagosXseparacion(fieldSet.readString("impOtrosPagosXseparacion"));
		a1TO.setImpTotal(fieldSet.readString("impTotal"));		
		return a1TO;		
	}
	
	public A2TO mapFieldSetToA2(FieldSet fieldSet, int paramInt){
		A2TO a2TO = new A2TO();
		a2TO.setImpInstrumentosTrabajo(fieldSet.readString("impInstrumentosTrabajo"));
		a2TO.setImpGastosPrevisionSocial(fieldSet.readString("impGastosPrevisionSocial"));
		a2TO.setImpAlimentacion(fieldSet.readString("impAlimentacion"));
		a2TO.setImpHabitacion(fieldSet.readString("impHabitacion"));
		a2TO.setImpAportacionAdicionalRcv(fieldSet.readString("impAportacionAdicionalRcv"));
		a2TO.setImpCuotaObrera(fieldSet.readString("impCuotaObrera"));
		a2TO.setImpCuotaPatronalInfonavit(fieldSet.readString("impCuotaPatronalInfonavit"));
		a2TO.setImpFondoPensiones(fieldSet.readString("impFondoPensiones"));
		a2TO.setImpOtrasPrestaciones(fieldSet.readString("impOtrasPrestaciones"));
		a2TO.setImpTotal(fieldSet.readString("impTotal"));
		a2TO.setLineNumber(paramInt);
		return a2TO;
	}

}

