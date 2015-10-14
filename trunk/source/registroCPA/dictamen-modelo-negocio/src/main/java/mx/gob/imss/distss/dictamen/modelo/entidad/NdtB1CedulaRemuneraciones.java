package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NDT_B1_CEDULA_REMUNERACIONES")
@NamedQuery(name="NdtB1CedulaRemuneraciones.findAll", query="SELECT n FROM NdtB1CedulaRemuneraciones n")
public class NdtB1CedulaRemuneraciones implements Serializable {
	
	private static final long serialVersionUID = -1485029521321076785L;
	
	@Id
	@Column(name="CVE_ID_B1_CED_REMUNERA", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtB1CedulaRemuneraciones_Id_Seq_Gen", sequenceName = "SEQ_NDTB1CEDULAREMUNERACIONES")
    @GeneratedValue(generator = "NdtB1CedulaRemuneraciones_Id_Seq_Gen")
	private Long cveIdB1CedRemunera;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IMP_IMPORTE_PAGADO", precision=15, scale=2)
	private Long impImportePagado;

	@Column(name="IND_FIJO_VARIABLE", precision=1)
	private Long indFijoVariable;

	@Column(name="IND_INTEGRA_SBC", precision=1)
	private Long indIntegraSbc;

	@Column(name="POR_FAHORRO_APOOBR")
	private Long porFahorroApoobr;

	@Column(name="POR_FAHORRO_APOPAT")
	private Long porFahorroApopat;

	//bi-directional many-to-one association to NdcAtestiguamiento
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_ATESTIGUAMIENTO")
	private NdcAtestiguamiento ndcAtestiguamiento;

	//bi-directional many-to-one association to NdcRemuneraciones
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_REMUNERACIONES")
	private NdcRemuneraciones ndcRemuneracione;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	//bi-directional many-to-one association to NdtB1DetOtrosIngXsalario
	@OneToMany(mappedBy="ndtB1CedulaRemuneracione")
	private List<NdtB1DetOtrosIngXsalario> listNdtB1DetOtrosIngXsalarios;

	//bi-directional many-to-one association to NdtB1DetOtrosPagXseparac
	@OneToMany(mappedBy="ndtB1CedulaRemuneracione")
	private List<NdtB1DetOtrosPagXseparac> listNdtB1DetOtrosPagXseparacs;

	//bi-directional many-to-one association to NdtB1DetPagosOtrosEmplead
	@OneToMany(mappedBy="ndtB1CedulaRemuneracione")
	private List<NdtB1DetPagosOtrosEmplead> listNdtB1DetPagosOtrosEmpleads;

	public NdtB1CedulaRemuneraciones() {
	}

	public Long getCveIdB1CedRemunera() {
		return cveIdB1CedRemunera;
	}

	public void setCveIdB1CedRemunera(Long cveIdB1CedRemunera) {
		this.cveIdB1CedRemunera = cveIdB1CedRemunera;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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

	public Long getImpImportePagado() {
		return impImportePagado;
	}

	public void setImpImportePagado(Long impImportePagado) {
		this.impImportePagado = impImportePagado;
	}

	public Long getIndFijoVariable() {
		return indFijoVariable;
	}

	public void setIndFijoVariable(Long indFijoVariable) {
		this.indFijoVariable = indFijoVariable;
	}

	public Long getIndIntegraSbc() {
		return indIntegraSbc;
	}

	public void setIndIntegraSbc(Long indIntegraSbc) {
		this.indIntegraSbc = indIntegraSbc;
	}

	public Long getPorFahorroApoobr() {
		return porFahorroApoobr;
	}

	public void setPorFahorroApoobr(Long porFahorroApoobr) {
		this.porFahorroApoobr = porFahorroApoobr;
	}

	public Long getPorFahorroApopat() {
		return porFahorroApopat;
	}

	public void setPorFahorroApopat(Long porFahorroApopat) {
		this.porFahorroApopat = porFahorroApopat;
	}

	public NdcAtestiguamiento getNdcAtestiguamiento() {
		return ndcAtestiguamiento;
	}

	public void setNdcAtestiguamiento(NdcAtestiguamiento ndcAtestiguamiento) {
		this.ndcAtestiguamiento = ndcAtestiguamiento;
	}

	public NdcRemuneraciones getNdcRemuneracione() {
		return ndcRemuneracione;
	}

	public void setNdcRemuneracione(NdcRemuneraciones ndcRemuneracione) {
		this.ndcRemuneracione = ndcRemuneracione;
	}

	public NdtPatronDictamen getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamen ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

	public List<NdtB1DetOtrosIngXsalario> getListNdtB1DetOtrosIngXsalarios() {
		return listNdtB1DetOtrosIngXsalarios;
	}

	public void setListNdtB1DetOtrosIngXsalarios(List<NdtB1DetOtrosIngXsalario> listNdtB1DetOtrosIngXsalarios) {
		this.listNdtB1DetOtrosIngXsalarios = listNdtB1DetOtrosIngXsalarios;
	}

	public List<NdtB1DetOtrosPagXseparac> getListNdtB1DetOtrosPagXseparacs() {
		return listNdtB1DetOtrosPagXseparacs;
	}

	public void setListNdtB1DetOtrosPagXseparacs(List<NdtB1DetOtrosPagXseparac> listNdtB1DetOtrosPagXseparacs) {
		this.listNdtB1DetOtrosPagXseparacs = listNdtB1DetOtrosPagXseparacs;
	}

	public List<NdtB1DetPagosOtrosEmplead> getListNdtB1DetPagosOtrosEmpleads() {
		return listNdtB1DetPagosOtrosEmpleads;
	}

	public void setListNdtB1DetPagosOtrosEmpleads(List<NdtB1DetPagosOtrosEmplead> listNdtB1DetPagosOtrosEmpleads) {
		this.listNdtB1DetPagosOtrosEmpleads = listNdtB1DetPagosOtrosEmpleads;
	}

}
