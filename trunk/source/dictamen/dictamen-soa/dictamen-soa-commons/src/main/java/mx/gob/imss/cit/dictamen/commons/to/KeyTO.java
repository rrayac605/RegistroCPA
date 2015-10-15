package mx.gob.imss.cit.dictamen.commons.to;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class KeyTO {
	private String anioEjercicio;
	private String rfcUsuario;
	private String rfcPatron;
	private String layoutName;
	private String layoutId;
	
	public KeyTO(){
		
	}
	
	public KeyTO(String anioEjercicio, String rfcUsuario, String rfcPatron, String layoutName, String layoutId){
		this.anioEjercicio = anioEjercicio;
		this.rfcUsuario = rfcUsuario;
		this.rfcPatron = rfcPatron;
		this.layoutName = layoutName;
		this.layoutId = layoutId;
	}
	
	public String getAnioEjercicio() {
		return anioEjercicio;
	}
	public void setAnioEjercicio(String anioEjercicio) {
		this.anioEjercicio = anioEjercicio;
	}
	public String getRfcUsuario() {
		return rfcUsuario;
	}
	public void setRfcUsuario(String rfcUsuario) {
		this.rfcUsuario = rfcUsuario;
	}
	public String getRfcPatron() {
		return rfcPatron;
	}
	public void setRfcPatron(String rfcPatron) {
		this.rfcPatron = rfcPatron;
	}
	public String getLayoutName() {
		return layoutName;
	}
	public void setLayoutName(String layoutName) {
		this.layoutName = layoutName;
	}

	public String getLayoutId() {
		return layoutId;
	}

	public void setLayoutId(String layoutId) {
		this.layoutId = layoutId;
	}
	
	
}

