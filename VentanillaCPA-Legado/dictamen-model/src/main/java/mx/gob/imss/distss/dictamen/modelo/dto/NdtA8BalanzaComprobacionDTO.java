package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtA8BalanzaComprobacionDTO implements Serializable {

	private static final long serialVersionUID = 225861867947534965L;

	private Long cveIdA8BalanzaComprobacion;
	private String cveIdUsuario;
	private String desNombreCuentaSubcuenta;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Long impDebe;
	private Long impHaber;
	private Long impSaldoFinal;
	private Long impSaldoInicial;
	private String numCuenta;
	private Long numNivel;

	public Long getCveIdA8BalanzaComprobacion() {
		return cveIdA8BalanzaComprobacion;
	}

	public void setCveIdA8BalanzaComprobacion(Long cveIdA8BalanzaComprobacion) {
		this.cveIdA8BalanzaComprobacion = cveIdA8BalanzaComprobacion;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesNombreCuentaSubcuenta() {
		return desNombreCuentaSubcuenta;
	}

	public void setDesNombreCuentaSubcuenta(String desNombreCuentaSubcuenta) {
		this.desNombreCuentaSubcuenta = desNombreCuentaSubcuenta;
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

	public Long getImpDebe() {
		return impDebe;
	}

	public void setImpDebe(Long impDebe) {
		this.impDebe = impDebe;
	}

	public Long getImpHaber() {
		return impHaber;
	}

	public void setImpHaber(Long impHaber) {
		this.impHaber = impHaber;
	}

	public Long getImpSaldoFinal() {
		return impSaldoFinal;
	}

	public void setImpSaldoFinal(Long impSaldoFinal) {
		this.impSaldoFinal = impSaldoFinal;
	}

	public Long getImpSaldoInicial() {
		return impSaldoInicial;
	}

	public void setImpSaldoInicial(Long impSaldoInicial) {
		this.impSaldoInicial = impSaldoInicial;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public Long getNumNivel() {
		return numNivel;
	}

	public void setNumNivel(Long numNivel) {
		this.numNivel = numNivel;
	}

}
