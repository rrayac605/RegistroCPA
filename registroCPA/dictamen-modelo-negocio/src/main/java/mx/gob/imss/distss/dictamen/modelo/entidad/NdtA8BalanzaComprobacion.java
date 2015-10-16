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
@Table(name="NDT_A8_BALANZA_COMPROBACION")
@NamedQuery(name="NdtA8BalanzaComprobacion.findAll", query="SELECT n FROM NdtA8BalanzaComprobacion n")
public class NdtA8BalanzaComprobacion implements Serializable {
	
	private static final long serialVersionUID = 5381649734051007882L;
	
	@Id
	@Column(name="CVE_ID_A8_BALANZA_COMPROBACION", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtA8BalanzaComprobacion_Id_Seq_Gen", sequenceName = "SEQ_NDTA8BALANZACOMPROBACION")
    @GeneratedValue(generator = "NdtA8BalanzaComprobacion_Id_Seq_Gen")
	private Long cveIdA8BalanzaComprobacion;

	@Column(name="CVE_ID_USUARIO", length=20)
	private String cveIdUsuario;

	@Column(name="DES_NOMBRE_CUENTA_SUBCUENTA", length=100)
	private String desNombreCuentaSubcuenta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="IMP_DEBE", precision=14, scale=2)
	private Long impDebe;

	@Column(name="IMP_HABER", precision=14, scale=2)
	private Long impHaber;

	@Column(name="IMP_SALDO_FINAL", precision=14, scale=2)
	private Long impSaldoFinal;

	@Column(name="IMP_SALDO_INICIAL", precision=14, scale=2)
	private Long impSaldoInicial;

	@Column(name="NUM_CUENTA", length=15)
	private String numCuenta;

	@Column(name="NUM_NIVEL", precision=1)
	private Long numNivel;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtA8BalanzaComprobacion() {
	}

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

	public NdtPatronDictamen getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamen ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

}