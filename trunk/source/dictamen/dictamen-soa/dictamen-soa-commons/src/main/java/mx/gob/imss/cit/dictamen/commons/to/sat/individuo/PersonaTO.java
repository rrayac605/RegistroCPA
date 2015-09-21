package mx.gob.imss.cit.dictamen.commons.to.sat.individuo;

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.DocumentoProbatorioTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.documento.probatorio.NacimientoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DomicilioFiscalTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.domicilio.DomicilioTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.CorreoElectronicoTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.FacebookTO;
import mx.gob.imss.cit.dictamen.commons.to.sat.medio.contacto.MedioContactoTO;

public class PersonaTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NacimientoTO actaNacimiento;
	private CorreoElectronicoTO correoElectronico;
	private CorreoElectronicoTO correoElectronicoFiscal;
	private List<DocumentoProbatorioTO> documentosProbatorios = new ArrayList<DocumentoProbatorioTO>();
	private DomicilioFiscalTO domicilioFiscal;
	private List<DomicilioTO> domicilios = new ArrayList<DomicilioTO>();
	private FacebookTO facebook;
	private FielTO fiel;
	private List<IdentificadorTO> identificadores = new ArrayList<IdentificadorTO>();
	private Long idPersona;
	private Boolean indRIF;
	private List<MedioContactoTO> mediosContacto = new ArrayList<MedioContactoTO>();
}
