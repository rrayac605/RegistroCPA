package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NdtB1CedulaRemuneracionesDTO implements Serializable {

	private static final long serialVersionUID = -3803663020602014146L;

	private Long cveIdB1CedRemunera;
	private String cveIdUsuario;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Long impImportePagado;
	private Long indFijoVariable;
	private Long indIntegraSbc;
	private Long porFahorroApoobr;
	private Long porFahorroApopat;
	private NdcAtestiguamientoDTO ndcAtestiguamiento;
	private NdcRemuneracionesDTO ndcRemuneracione;
	private List<NdtB1DetOtrosIngXsalarioDTO> listNdtB1DetOtrosIngXsalarios;
	private List<NdtB1DetOtrosPagXseparacDTO> listNdtB1DetOtrosPagXseparacs;
	private List<NdtB1DetPagosOtrosEmpleadDTO> listNdtB1DetPagosOtrosEmpleads;

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

	public NdcAtestiguamientoDTO getNdcAtestiguamiento() {
		return ndcAtestiguamiento;
	}

	public void setNdcAtestiguamiento(NdcAtestiguamientoDTO ndcAtestiguamiento) {
		this.ndcAtestiguamiento = ndcAtestiguamiento;
	}

	public NdcRemuneracionesDTO getNdcRemuneracione() {
		return ndcRemuneracione;
	}

	public void setNdcRemuneracione(NdcRemuneracionesDTO ndcRemuneracione) {
		this.ndcRemuneracione = ndcRemuneracione;
	}

	public List<NdtB1DetOtrosIngXsalarioDTO> getListNdtB1DetOtrosIngXsalarios() {
		return listNdtB1DetOtrosIngXsalarios;
	}

	public void setListNdtB1DetOtrosIngXsalarios(List<NdtB1DetOtrosIngXsalarioDTO> listNdtB1DetOtrosIngXsalarios) {
		this.listNdtB1DetOtrosIngXsalarios = listNdtB1DetOtrosIngXsalarios;
	}

	public List<NdtB1DetOtrosPagXseparacDTO> getListNdtB1DetOtrosPagXseparacs() {
		return listNdtB1DetOtrosPagXseparacs;
	}

	public void setListNdtB1DetOtrosPagXseparacs(List<NdtB1DetOtrosPagXseparacDTO> listNdtB1DetOtrosPagXseparacs) {
		this.listNdtB1DetOtrosPagXseparacs = listNdtB1DetOtrosPagXseparacs;
	}

	public List<NdtB1DetPagosOtrosEmpleadDTO> getListNdtB1DetPagosOtrosEmpleads() {
		return listNdtB1DetPagosOtrosEmpleads;
	}

	public void setListNdtB1DetPagosOtrosEmpleads(List<NdtB1DetPagosOtrosEmpleadDTO> listNdtB1DetPagosOtrosEmpleads) {
		this.listNdtB1DetPagosOtrosEmpleads = listNdtB1DetPagosOtrosEmpleads;
	}

}
