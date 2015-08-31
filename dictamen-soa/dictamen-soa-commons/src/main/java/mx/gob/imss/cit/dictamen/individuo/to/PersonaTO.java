package mx.gob.imss.cit.dictamen.individuo.to;

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.BaseTO;
import mx.gob.imss.cit.dictamen.documento.probatorio.to.NacimientoTO;
import mx.gob.imss.cit.dictamen.domicilio.to.DomicilioFiscalTO;
import mx.gob.imss.cit.dictamen.domicilio.to.DomicilioTO;
import mx.gob.imss.cit.dictamen.documento.probatorio.to.DocumentoProbatorioTO;
import mx.gob.imss.cit.dictamen.medio.contacto.to.CorreoElectronicoTO;
import mx.gob.imss.cit.dictamen.medio.contacto.to.FacebookTO;
import mx.gob.imss.cit.dictamen.medio.contacto.to.MedioContactoTO;

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
