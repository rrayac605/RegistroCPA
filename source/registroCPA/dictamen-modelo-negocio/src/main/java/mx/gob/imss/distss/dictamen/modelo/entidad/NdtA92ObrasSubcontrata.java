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
@Table(name="NDT_A9_2_OBRAS_SUBCONTRATA")
@NamedQuery(name="NdtA92ObrasSubcontrata.findAll", query="SELECT n FROM NdtA92ObrasSubcontrata n")
public class NdtA92ObrasSubcontrata implements Serializable {
	
	private static final long serialVersionUID = 5860554326890511705L;
	
	@Id
	@Column(name="CVE_ID_A9_2_OBRAS_SUBCONTRATA", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA92ObrasSubcontrata_Id_Seq_Gen", sequenceName = "SEQ_NDTA92OBRASSUBCONTRATA")
    @GeneratedValue(generator = "NdtA92ObrasSubcontrata_Id_Seq_Gen")
	private Long cveIdA92ObrasSubcontrata;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Column(name="DES_FASE_CONSTRUCCION", length=255)
	private String desFaseConstruccion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_AL_EJECUCION")
	private Date fecAlEjecucion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_DEL_EJECUCION")
	private Date fecDelEjecucion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IMP_CONTRATADO", precision=15, scale=2)
	private Long impContratado;

	@Column(name="NOM_NOMBRE_RAZONSOCIAL", length=255)
	private String nomNombreRazonsocial;

	@Column(name="NUM_REG_OBRA_IMSS", length=20)
	private String numRegObraImss;

	@Column(name="NUM_REG_OBRA_IMSS_SUBCONTRA", length=20)
	private String numRegObraImssSubcontra;

	@Column(name="NUM_SUPERFICIE_M2", precision=12)
	private Long numSuperficieM2;

	@Column(name="NUM_TRABAJADORES_PARTICIPANTES", precision=5)
	private Long numTrabajadoresParticipantes;

	@Column(name="REG_PATRONAL", length=11)
	private String regPatronal;

	@Column(name="RFC", length=13)
	private String rfc;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtA92ObrasSubcontrata() {
	}

	public Long getCveIdA92ObrasSubcontrata() {
		return cveIdA92ObrasSubcontrata;
	}

	public void setCveIdA92ObrasSubcontrata(Long cveIdA92ObrasSubcontrata) {
		this.cveIdA92ObrasSubcontrata = cveIdA92ObrasSubcontrata;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesFaseConstruccion() {
		return desFaseConstruccion;
	}

	public void setDesFaseConstruccion(String desFaseConstruccion) {
		this.desFaseConstruccion = desFaseConstruccion;
	}

	public Date getFecAlEjecucion() {
		return fecAlEjecucion;
	}

	public void setFecAlEjecucion(Date fecAlEjecucion) {
		this.fecAlEjecucion = fecAlEjecucion;
	}

	public Date getFecDelEjecucion() {
		return fecDelEjecucion;
	}

	public void setFecDelEjecucion(Date fecDelEjecucion) {
		this.fecDelEjecucion = fecDelEjecucion;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
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

	public Long getImpContratado() {
		return impContratado;
	}

	public void setImpContratado(Long impContratado) {
		this.impContratado = impContratado;
	}

	public String getNomNombreRazonsocial() {
		return nomNombreRazonsocial;
	}

	public void setNomNombreRazonsocial(String nomNombreRazonsocial) {
		this.nomNombreRazonsocial = nomNombreRazonsocial;
	}

	public String getNumRegObraImss() {
		return numRegObraImss;
	}

	public void setNumRegObraImss(String numRegObraImss) {
		this.numRegObraImss = numRegObraImss;
	}

	public String getNumRegObraImssSubcontra() {
		return numRegObraImssSubcontra;
	}

	public void setNumRegObraImssSubcontra(String numRegObraImssSubcontra) {
		this.numRegObraImssSubcontra = numRegObraImssSubcontra;
	}

	public Long getNumSuperficieM2() {
		return numSuperficieM2;
	}

	public void setNumSuperficieM2(Long numSuperficieM2) {
		this.numSuperficieM2 = numSuperficieM2;
	}

	public Long getNumTrabajadoresParticipantes() {
		return numTrabajadoresParticipantes;
	}

	public void setNumTrabajadoresParticipantes(Long numTrabajadoresParticipantes) {
		this.numTrabajadoresParticipantes = numTrabajadoresParticipantes;
	}

	public String getRegPatronal() {
		return regPatronal;
	}

	public void setRegPatronal(String regPatronal) {
		this.regPatronal = regPatronal;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public NdtPatronDictamen getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamen ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

}