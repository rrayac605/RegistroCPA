package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NDT_R3_COLEGIO")
@NamedQuery(name="NdtR3Colegio.findAll", query="SELECT n FROM NdtR3Colegio n")
public class NdtR3Colegio implements Serializable {
	
	private static final long serialVersionUID = 2686225029667563695L;
	
	@Id
	@Column(name="CVE_ID_R3_COLEGIO_XCONTADOR_", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtR3Colegio_Id_Seq_Gen", sequenceName = "SEQ_NDTR3COLEGIO")
    @GeneratedValue(generator = "NdtR3Colegio_Id_Seq_Gen")
	private Long cveIdR3ColegioXcontador;

	@Column(name="CVE_ID_USUARIO", length=18)
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="NUM_TRAMITE_NOTARIA", length=70)
	private String numTramiteNotaria;

	@Column(name="URL_ACUSE_NOTARIA", length=300)
	private String urlAcuseNotaria;

	//bi-directional many-to-one association to NdtColegio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_COLEGIO")
	private NdtColegio ndtColegio;

	//bi-directional many-to-one association to NdtContadorPublicoAut
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_CPA", nullable=false)
	private NdtContadorPublicoAut ndtContadorPublicoAut;

	//bi-directional many-to-one association to NdtCpaTramite
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_CPA_TRAMITE")
	private NdtCpaTramite ndtCpaTramite;

	public NdtR3Colegio() {
	}

	public Long getCveIdR3ColegioXcontador() {
		return cveIdR3ColegioXcontador;
	}

	public void setCveIdR3ColegioXcontador(Long cveIdR3ColegioXcontador) {
		this.cveIdR3ColegioXcontador = cveIdR3ColegioXcontador;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public String getNumTramiteNotaria() {
		return numTramiteNotaria;
	}

	public void setNumTramiteNotaria(String numTramiteNotaria) {
		this.numTramiteNotaria = numTramiteNotaria;
	}

	public String getUrlAcuseNotaria() {
		return urlAcuseNotaria;
	}

	public void setUrlAcuseNotaria(String urlAcuseNotaria) {
		this.urlAcuseNotaria = urlAcuseNotaria;
	}

	public NdtColegio getNdtColegio() {
		return ndtColegio;
	}

	public void setNdtColegio(NdtColegio ndtColegio) {
		this.ndtColegio = ndtColegio;
	}

	public NdtContadorPublicoAut getNdtContadorPublicoAut() {
		return ndtContadorPublicoAut;
	}

	public void setNdtContadorPublicoAut(NdtContadorPublicoAut ndtContadorPublicoAut) {
		this.ndtContadorPublicoAut = ndtContadorPublicoAut;
	}

	public NdtCpaTramite getNdtCpaTramite() {
		return ndtCpaTramite;
	}

	public void setNdtCpaTramite(NdtCpaTramite ndtCpaTramite) {
		this.ndtCpaTramite = ndtCpaTramite;
	}

}