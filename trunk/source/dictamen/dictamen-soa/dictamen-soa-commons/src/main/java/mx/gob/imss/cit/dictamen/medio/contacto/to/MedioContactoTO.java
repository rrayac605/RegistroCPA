package mx.gob.imss.cit.dictamen.medio.contacto.to;

import mx.gob.imss.cit.dictamen.commons.to.BaseTO;
import mx.gob.imss.cit.dictamen.enums.EstadoAdministracionEnum;

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
