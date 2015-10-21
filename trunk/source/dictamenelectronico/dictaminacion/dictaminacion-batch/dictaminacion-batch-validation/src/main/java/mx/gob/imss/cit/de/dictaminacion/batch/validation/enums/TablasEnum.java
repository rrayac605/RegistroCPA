package mx.gob.imss.cit.de.dictaminacion.batch.validation.enums;

public enum TablasEnum {

	ASEVERACION_1("NDT_A1_PERCEP_TRABAJADOR",1),
	ASEVERACION_2("NDT_A2_OTRA_PREST_OTORGADA",2),
	ASEVERACION_3("NDT_A3_CUOTA_OBRERO_PATRONAL",3),
	ASEVERACION_4("NDT_A4_PAGO_PERSONA_FISICA",4),
	ASEVERACION_5("NDT_A5_1_PERSONAL_PROPORCIONAD",5),
	ASEVERACION_6("NDT_A5_PRESTADORA_SERVICIOS",6),
	ASEVERACION_7("NDT_A6_1_PERSONAL_PROPORCIONAD",7),
	ASEVERACION_8("NDT_A6_SUBCONTRATACION_SP",8),
	ASEVERACION_9("NDT_A7_1_CE_PROCESO",9),
	ASEVERACION_10("NDT_A7_2_CE_BIEN",10),
	ASEVERACION_11("NDT_A7_3_CE_MAQUINARIA",11),
	ASEVERACION_12("NDT_A7_4_CE_TRANSPORTE",12),
	ASEVERACION_13("NDT_A7_5_CE_PERSONAL",13),
	ASEVERACION_14("NDT_A7_6_CE_ACT_COMP",14),
	ASEVERACION_15("NDT_A8_BALANZA_COMPROBACION",15),
	ASEVERACION_16("NDT_A9_1_1_PERSONAL_OBRA",16),
	ASEVERACION_17("NDT_A9_1_OBRAS_CONSTRUCCION",17),
	ASEVERACION_18("NDT_A9_2_1_PERS_SUBCONTRATADO",18),
	ASEVERACION_19("NDT_A9_2_OBRAS_SUBCONTRATA",19);
	
	
	private String tabla;
	private int id;

	private TablasEnum(String tabla,int id) {
		this.tabla = tabla;
		this.id=id;
	}

	public String getTabla() {
		return tabla;
	}

	public int getId() {
		return id;
	}

	
}
