package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DG_DOMICILIOS_CARRETERAS database table.
 * 
 */
@Entity
@Table(name="DG_DOMICILIOS_CARRETERAS")
@NamedQuery(name="DgDomiciliosCarreterasDO.findAll", query="SELECT d FROM DgDomiciliosCarreterasDO d")
public class DgDomiciliosCarreterasDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DOMICILIO_ID")
	private long domicilioId;

	private String cadenamiento;

	private BigDecimal codigo;

	private String destino;

	private String nomvial;

	private String origen;

	//bi-directional many-to-one association to DgCatAdministracionDO
	@ManyToOne
	@JoinColumn(name="CVE_CAC")
	private DgCatAdministracionDO dgCatAdministracion;

	//bi-directional many-to-one association to DgCatDerechosTransitoDO
	@ManyToOne
	@JoinColumn(name="CVE_CDT")
	private DgCatDerechosTransitoDO dgCatDerechosTransito;

	//bi-directional many-to-one association to DgCatTermGenDO
	@ManyToOne
	@JoinColumn(name="CVE_TER")
	private DgCatTermGenDO dgCatTermGen;

	//bi-directional one-to-one association to DgDomicilioGeograficoDO
	@OneToOne
	@JoinColumn(name="DOMICILIO_ID", insertable=false, updatable=false)
	private DgDomicilioGeograficoDO dgDomicilioGeografico;

	public DgDomiciliosCarreterasDO() {
	}

	public long getDomicilioId() {
		return this.domicilioId;
	}

	public void setDomicilioId(long domicilioId) {
		this.domicilioId = domicilioId;
	}

	public String getCadenamiento() {
		return this.cadenamiento;
	}

	public void setCadenamiento(String cadenamiento) {
		this.cadenamiento = cadenamiento;
	}

	public BigDecimal getCodigo() {
		return this.codigo;
	}

	public void setCodigo(BigDecimal codigo) {
		this.codigo = codigo;
	}

	public String getDestino() {
		return this.destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getNomvial() {
		return this.nomvial;
	}

	public void setNomvial(String nomvial) {
		this.nomvial = nomvial;
	}

	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public DgCatAdministracionDO getDgCatAdministracion() {
		return this.dgCatAdministracion;
	}

	public void setDgCatAdministracion(DgCatAdministracionDO dgCatAdministracion) {
		this.dgCatAdministracion = dgCatAdministracion;
	}

	public DgCatDerechosTransitoDO getDgCatDerechosTransito() {
		return this.dgCatDerechosTransito;
	}

	public void setDgCatDerechosTransito(DgCatDerechosTransitoDO dgCatDerechosTransito) {
		this.dgCatDerechosTransito = dgCatDerechosTransito;
	}

	public DgCatTermGenDO getDgCatTermGen() {
		return this.dgCatTermGen;
	}

	public void setDgCatTermGen(DgCatTermGenDO dgCatTermGen) {
		this.dgCatTermGen = dgCatTermGen;
	}

	public DgDomicilioGeograficoDO getDgDomicilioGeografico() {
		return this.dgDomicilioGeografico;
	}

	public void setDgDomicilioGeografico(DgDomicilioGeograficoDO dgDomicilioGeografico) {
		this.dgDomicilioGeografico = dgDomicilioGeografico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cadenamiento == null) ? 0 : cadenamiento.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((destino == null) ? 0 : destino.hashCode());
		result = prime * result + ((dgCatAdministracion == null) ? 0 : dgCatAdministracion.hashCode());
		result = prime * result + ((dgCatDerechosTransito == null) ? 0 : dgCatDerechosTransito.hashCode());
		result = prime * result + ((dgCatTermGen == null) ? 0 : dgCatTermGen.hashCode());
		result = prime * result + ((dgDomicilioGeografico == null) ? 0 : dgDomicilioGeografico.hashCode());
		result = prime * result + (int) (domicilioId ^ (domicilioId >>> 32));
		result = prime * result + ((nomvial == null) ? 0 : nomvial.hashCode());
		result = prime * result + ((origen == null) ? 0 : origen.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DgDomiciliosCarreterasDO other = (DgDomiciliosCarreterasDO) obj;
		if (cadenamiento == null) {
			if (other.cadenamiento != null)
				return false;
		} else if (!cadenamiento.equals(other.cadenamiento))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		if (dgCatAdministracion == null) {
			if (other.dgCatAdministracion != null)
				return false;
		} else if (!dgCatAdministracion.equals(other.dgCatAdministracion))
			return false;
		if (dgCatDerechosTransito == null) {
			if (other.dgCatDerechosTransito != null)
				return false;
		} else if (!dgCatDerechosTransito.equals(other.dgCatDerechosTransito))
			return false;
		if (dgCatTermGen == null) {
			if (other.dgCatTermGen != null)
				return false;
		} else if (!dgCatTermGen.equals(other.dgCatTermGen))
			return false;
		if (dgDomicilioGeografico == null) {
			if (other.dgDomicilioGeografico != null)
				return false;
		} else if (!dgDomicilioGeografico.equals(other.dgDomicilioGeografico))
			return false;
		if (domicilioId != other.domicilioId)
			return false;
		if (nomvial == null) {
			if (other.nomvial != null)
				return false;
		} else if (!nomvial.equals(other.nomvial))
			return false;
		if (origen == null) {
			if (other.origen != null)
				return false;
		} else if (!origen.equals(other.origen))
			return false;
		return true;
	}
	
	

}