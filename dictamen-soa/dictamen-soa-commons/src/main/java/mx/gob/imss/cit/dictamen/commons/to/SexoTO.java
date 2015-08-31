package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;
import java.util.List;

public class SexoTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -928649660934732391L;

	private long cveIdSexo;

	private String desSexo;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private List<PersonaTO> ditPersonas;

	public long getCveIdSexo() {
		return cveIdSexo;
	}

	public void setCveIdSexo(long cveIdSexo) {
		this.cveIdSexo = cveIdSexo;
	}

	public String getDesSexo() {
		return desSexo;
	}

	public void setDesSexo(String desSexo) {
		this.desSexo = desSexo;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado != null ? (Date) fecRegistroActualizado.clone() : null;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta != null ? (Date) fecRegistroAlta.clone() : null;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja != null ? (Date) fecRegistroBaja.clone() : null;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public List<PersonaTO> getDitPersonas() {
		return ditPersonas;
	}

	public void setDitPersonas(List<PersonaTO> ditPersonas) {
		this.ditPersonas = ditPersonas;
	}

	
	
	
}
