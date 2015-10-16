package mx.gob.imss.distss.dictamen.integration.sample;

import mx.gob.imss.distss.dictamen.table.model.DescriptorTabla;

import java.util.HashMap;

public interface EstructuraBase {
	HashMap<String,DescriptorTabla> getModeloTablas();
	DescriptorTabla getDescriptorTabla(String clave);
}
