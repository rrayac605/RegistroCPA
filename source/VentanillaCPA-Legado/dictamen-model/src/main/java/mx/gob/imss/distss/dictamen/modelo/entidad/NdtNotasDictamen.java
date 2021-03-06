package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;

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

@Entity
@Table(name="NDT_NOTAS_DICTAMEN")
@NamedQuery(name="NdtNotasDictamen.findAll", query="SELECT n FROM NdtNotasDictamen n")
public class NdtNotasDictamen implements Serializable {
	
	private static final long serialVersionUID = 4484314464697102984L;
	
	@Id
	@Column(name="CVE_ID_NOTAS_ASEVERACIONES", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtNotasDictamen_Id_Seq_Gen", sequenceName = "SEQ_NDTNOTASDICTAMEN")
    @GeneratedValue(generator = "NdtNotasDictamen_Id_Seq_Gen")
	private Long cveIdNotasAseveraciones;

	@Column(name="DES_NOTAS_ASEV_A1", length=1000)
	private String desNotasAsevA1;

	@Column(name="DES_NOTAS_ASEV_A2", length=1000)
	private String desNotasAsevA2;

	@Column(name="DES_NOTAS_ASEV_A3", length=1000)
	private String desNotasAsevA3;

	@Column(name="DES_NOTAS_ASEV_A4", length=1000)
	private String desNotasAsevA4;

	@Column(name="DES_NOTAS_ASEV_A5", length=1000)
	private String desNotasAsevA5;

	@Column(name="DES_NOTAS_ASEV_A6", length=1000)
	private String desNotasAsevA6;

	@Column(name="DES_NOTAS_ASEV_A7", length=1000)
	private String desNotasAsevA7;

	@Column(name="DES_NOTAS_ASEV_A8", length=1000)
	private String desNotasAsevA8;

	@Column(name="DES_NOTAS_ASEV_A91", length=1000)
	private String desNotasAsevA91;

	@Column(name="DES_NOTAS_ASEV_A92", length=1000)
	private String desNotasAsevA92;

	//bi-directional many-to-one association to NdtPatronDictamen
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_PATRON_DICTAMEN")
	private NdtPatronDictamen ndtPatronDictamen;

	public NdtNotasDictamen() {
	}

	public Long getCveIdNotasAseveraciones() {
		return cveIdNotasAseveraciones;
	}

	public void setCveIdNotasAseveraciones(Long cveIdNotasAseveraciones) {
		this.cveIdNotasAseveraciones = cveIdNotasAseveraciones;
	}

	public String getDesNotasAsevA1() {
		return desNotasAsevA1;
	}

	public void setDesNotasAsevA1(String desNotasAsevA1) {
		this.desNotasAsevA1 = desNotasAsevA1;
	}

	public String getDesNotasAsevA2() {
		return desNotasAsevA2;
	}

	public void setDesNotasAsevA2(String desNotasAsevA2) {
		this.desNotasAsevA2 = desNotasAsevA2;
	}

	public String getDesNotasAsevA3() {
		return desNotasAsevA3;
	}

	public void setDesNotasAsevA3(String desNotasAsevA3) {
		this.desNotasAsevA3 = desNotasAsevA3;
	}

	public String getDesNotasAsevA4() {
		return desNotasAsevA4;
	}

	public void setDesNotasAsevA4(String desNotasAsevA4) {
		this.desNotasAsevA4 = desNotasAsevA4;
	}

	public String getDesNotasAsevA5() {
		return desNotasAsevA5;
	}

	public void setDesNotasAsevA5(String desNotasAsevA5) {
		this.desNotasAsevA5 = desNotasAsevA5;
	}

	public String getDesNotasAsevA6() {
		return desNotasAsevA6;
	}

	public void setDesNotasAsevA6(String desNotasAsevA6) {
		this.desNotasAsevA6 = desNotasAsevA6;
	}

	public String getDesNotasAsevA7() {
		return desNotasAsevA7;
	}

	public void setDesNotasAsevA7(String desNotasAsevA7) {
		this.desNotasAsevA7 = desNotasAsevA7;
	}

	public String getDesNotasAsevA8() {
		return desNotasAsevA8;
	}

	public void setDesNotasAsevA8(String desNotasAsevA8) {
		this.desNotasAsevA8 = desNotasAsevA8;
	}

	public String getDesNotasAsevA91() {
		return desNotasAsevA91;
	}

	public void setDesNotasAsevA91(String desNotasAsevA91) {
		this.desNotasAsevA91 = desNotasAsevA91;
	}

	public String getDesNotasAsevA92() {
		return desNotasAsevA92;
	}

	public void setDesNotasAsevA92(String desNotasAsevA92) {
		this.desNotasAsevA92 = desNotasAsevA92;
	}

	public NdtPatronDictamen getNdtPatronDictamen() {
		return ndtPatronDictamen;
	}

	public void setNdtPatronDictamen(NdtPatronDictamen ndtPatronDictamen) {
		this.ndtPatronDictamen = ndtPatronDictamen;
	}

}