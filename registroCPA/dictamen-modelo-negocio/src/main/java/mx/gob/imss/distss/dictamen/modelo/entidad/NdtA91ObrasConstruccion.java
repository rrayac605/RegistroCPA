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
@Table(name="NDT_A9_1_OBRAS_CONSTRUCCION")
@NamedQuery(name="NdtA91ObrasConstruccion.findAll", query="SELECT n FROM NdtA91ObrasConstruccion n")
public class NdtA91ObrasConstruccion implements Serializable {
	
	private static final long serialVersionUID = 7307416429291391342L;
	
	@Id
	@Column(name="CVE_ID_A9_1_OBRAS_CONSTRUCCION", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA91ObrasConstruccion_Id_Seq_Gen", sequenceName = "SEQ_NDTA91OBRASCONSTRUCCION")
    @GeneratedValue(generator = "NdtA91ObrasConstruccion_Id_Seq_Gen")
	private Long cveIdA91ObrasConstruccion;

	@Column(name="CALLE", length=100)
	private String calle;

	@Column(name="CODIGO_POSTAL", length=5)
	private String codigoPostal;

	@Column(name="COLONIA", length=100)
	private String colonia;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Column(name="DELEGACION", length=100)
	private String delegacion;

	@Column(name="DES_TIPO_FASE_OBRA", length=100)
	private String desTipoFaseObra;

	@Column(name="DES_TIPO_PRIVADA_PUBLICA", length=50)
	private String desTipoPrivadaPublica;

	@Column(name="ENTIDAD_FEDERATIVA", length=50)
	private String entidadFederativa;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_FIN_OBRA")
	private Date fecFinObra;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_INICIO_OBRA")
	private Date fecInicioObra;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IMP_CONTRATADO", precision=14, scale=2)
	private Long impContratado;

	@Column(name="IMP_TOTAL_REMUNERACION_PAGADA", precision=14, scale=2)
	private Long impTotalRemuneracionPagada;

	@Column(name="NUM_CONTRATO", length=20)
	private String numContrato;

	@Column(name="NUM_EXTERIOR", length=10)
	private String numExterior;

	@Column(name="NUM_INTERIOR", length=10)
	private String numInterior;

	@Column(name="NUM_REG_OBRA_IMSS", precision=15)
	private Long numRegObraImss;

	@Column(name="NUM_SUPERFICIE_M2", precision=6)
	private Long numSuperficieM2;

	@Column(name="NUM_TRABAJADORES", precision=6)
	private Long numTrabajadores;

	@Column(name="REG_PATRONAL", length=11)
	private String regPatronal;

	@Column(name="RFC", length=13)
	private String rfc;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtA91ObrasConstruccion() {
	}

	public Long getCveIdA91ObrasConstruccion() {
		return cveIdA91ObrasConstruccion;
	}

	public void setCveIdA91ObrasConstruccion(Long cveIdA91ObrasConstruccion) {
		this.cveIdA91ObrasConstruccion = cveIdA91ObrasConstruccion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDelegacion() {
		return delegacion;
	}

	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}

	public String getDesTipoFaseObra() {
		return desTipoFaseObra;
	}

	public void setDesTipoFaseObra(String desTipoFaseObra) {
		this.desTipoFaseObra = desTipoFaseObra;
	}

	public String getDesTipoPrivadaPublica() {
		return desTipoPrivadaPublica;
	}

	public void setDesTipoPrivadaPublica(String desTipoPrivadaPublica) {
		this.desTipoPrivadaPublica = desTipoPrivadaPublica;
	}

	public String getEntidadFederativa() {
		return entidadFederativa;
	}

	public void setEntidadFederativa(String entidadFederativa) {
		this.entidadFederativa = entidadFederativa;
	}

	public Date getFecFinObra() {
		return fecFinObra;
	}

	public void setFecFinObra(Date fecFinObra) {
		this.fecFinObra = fecFinObra;
	}

	public Date getFecInicioObra() {
		return fecInicioObra;
	}

	public void setFecInicioObra(Date fecInicioObra) {
		this.fecInicioObra = fecInicioObra;
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

	public Long getImpTotalRemuneracionPagada() {
		return impTotalRemuneracionPagada;
	}

	public void setImpTotalRemuneracionPagada(Long impTotalRemuneracionPagada) {
		this.impTotalRemuneracionPagada = impTotalRemuneracionPagada;
	}

	public String getNumContrato() {
		return numContrato;
	}

	public void setNumContrato(String numContrato) {
		this.numContrato = numContrato;
	}

	public String getNumExterior() {
		return numExterior;
	}

	public void setNumExterior(String numExterior) {
		this.numExterior = numExterior;
	}

	public String getNumInterior() {
		return numInterior;
	}

	public void setNumInterior(String numInterior) {
		this.numInterior = numInterior;
	}

	public Long getNumRegObraImss() {
		return numRegObraImss;
	}

	public void setNumRegObraImss(Long numRegObraImss) {
		this.numRegObraImss = numRegObraImss;
	}

	public Long getNumSuperficieM2() {
		return numSuperficieM2;
	}

	public void setNumSuperficieM2(Long numSuperficieM2) {
		this.numSuperficieM2 = numSuperficieM2;
	}

	public Long getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(Long numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
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