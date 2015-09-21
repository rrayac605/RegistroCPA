package mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.to;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.enums.EstadoAdministracionEnum;

public class MedioContactoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long clave;
	private String desFormaContacto;
	private EstadoAdministracionEnum estadoAdministracionAnteriorMedioContacto;
	private EstadoAdministracionEnum estadoAdministracionMedioContacto;
	private TipoMedioContactoTO tipoMedioContacto;;
}
