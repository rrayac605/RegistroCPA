package mx.gob.imss.distss.dictamen.integration.sample.impl;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.ejb.Remote;
import javax.ejb.Singleton;
import javax.enterprise.context.ApplicationScoped;

import com.google.gson.GsonBuilder;
import mx.gob.imss.distss.dictamen.integration.sample.EstructuraBase;
import mx.gob.imss.distss.dictamen.table.model.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Singleton(name = "estructuraBaseBusiness", mappedName = "estructuraBaseBusiness")
@Remote(EstructuraBase.class)
@ApplicationScoped
public class EstructuraBaseBusiness implements EstructuraBase{

	private static final Log LOGGER= LogFactory.getLog(EstructuraBaseBusiness.class);

	private HashMap<String,DescriptorTabla> mapaTablas=new HashMap<String, DescriptorTabla>();

	@Override
	public HashMap<String,DescriptorTabla> getModeloTablas(){
		return mapaTablas;
	}

    @Override
    public DescriptorTabla getDescriptorTabla(String clave) {
        return mapaTablas.get(clave);
    }

    private static class HelperJSON {
		private ArrayList<DescriptorTabla> tablas;

		public ArrayList<DescriptorTabla> getTablas() {
			return tablas;
		}

		public void setTablas(ArrayList<DescriptorTabla> tablas) {
			this.tablas = tablas;
		}
	}

	@PostConstruct
	public void afterCreate() {
		/*archivo requerido en carpeta main/resources*/
		String file="descriptor-aseveracion.json";
		try{
			LOGGER.info("cargando archivo de configuracion estructuraBase.txt...");
		    /*crea objetos a partir de la definicion hecha en archivo .json*/
			HelperJSON helper=new GsonBuilder().create().fromJson(new InputStreamReader(
					DescriptorTabla.class.getClassLoader().getResourceAsStream(file)
			), HelperJSON.class);
			for (DescriptorTabla descriptorTabla:helper.getTablas()){
				descriptorTabla.setClassDTO(Class.forName(descriptorTabla.getDto()));
				descriptorTabla.setClassEntity(Class.forName(descriptorTabla.getEntidad()));
				/*el parámetro clave de la tabla corresponde al key en hashmap*/
				mapaTablas.put(descriptorTabla.getClave(),descriptorTabla);
			}
		}catch(Exception ex){
			LOGGER.error("error ocurrido al intentar leer archivo de configuracion "+file+"...",ex);
		}
	}

}
