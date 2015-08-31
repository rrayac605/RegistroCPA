package mx.gob.imss.cit.dictamen.web.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.constants.WebConstants;
import mx.gob.imss.cit.dictamen.web.pages.CatalogoContadoresPage;
import mx.gob.imss.cit.dictamen.web.to.CatalogoTO;
import mx.gob.imss.cit.dictamen.web.to.ContadorDataTableTO;

@ManagedBean(name = "catalogoContadoresBean")
@ViewScoped
public class CatalogoContadoresBean extends BaseBean {
	
	private static final String DELEGACION=" Delegacion ";
	private static final String SUBDELEGACION=" SubDelegacion ";
	private static final int MAX_DELEGACION=10;	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4216799709251010849L;

    /** The configuracionDocumentoPage. */
    @ManagedProperty(value = "#{catalogoContadoresPage}")
    private CatalogoContadoresPage catalogoContadoresPage;

    public void init(){
    	catalogoContadoresPage.setDelegacion(new ArrayList<CatalogoTO>());
    	catalogoContadoresPage.setSubdelegaccion(new ArrayList<CatalogoTO>());
    	catalogoContadoresPage.setStatus(new ArrayList<CatalogoTO>());
    	initTemp();
    }
    
    private void initTemp(){
    	catalogoContadoresPage.getStatus().add(new CatalogoTO(1L,"Solicitado"));
    	catalogoContadoresPage.getStatus().add(new CatalogoTO(2L,"Rechazado"));
    	catalogoContadoresPage.getStatus().add(new CatalogoTO(3L,"Activo"));
    	catalogoContadoresPage.getStatus().add(new CatalogoTO(4L,"No Localizado"));
    	catalogoContadoresPage.getStatus().add(new CatalogoTO(5L,"1era. Amonestacion"));
    	catalogoContadoresPage.getStatus().add(new CatalogoTO(6L,"2da. Amonestacion"));
    	catalogoContadoresPage.getStatus().add(new CatalogoTO(7L,"Suspencion por 1 año"));
    
    	for(int i=WebConstants.UNO;catalogoContadoresPage.getDelegacion().size()<=MAX_DELEGACION;i++){
    		catalogoContadoresPage.getDelegacion().add(new CatalogoTO( new Long(i),DELEGACION+i));
    		//catalogoContadoresPage.getSubdelegaccion().add(new CatalogoTO( new Long(i),SUBDELEGACION+i));
    	}
    
    }
    
    
    
    public void changeDelegacion(){
    	System.out.println("***********************************************changeDelegacion="+catalogoContadoresPage.getIdDelegacion());
    	catalogoContadoresPage.setSubdelegaccion(new ArrayList<CatalogoTO>());
    	catalogoContadoresPage.setIdSubDelegacion(null);
    	if(catalogoContadoresPage.getIdDelegacion()!=null){
    		for(int i=WebConstants.UNO;i<=MAX_DELEGACION;i++){
        		catalogoContadoresPage.getSubdelegaccion().add(new CatalogoTO( new Long(i),(DELEGACION+catalogoContadoresPage.getIdDelegacion()+SUBDELEGACION+i)));
        		System.out.println("catalogoContadoresPage.getSubdelegaccion().add(new CatalogoTO("+i+"),"+DELEGACION+catalogoContadoresPage.getIdDelegacion()+SUBDELEGACION+i+"));");
        	}
    	}
    	System.out.println("**********"+catalogoContadoresPage.getSubdelegaccion().size());
    }
    
	/**
	 * @param catalogoContadoresPage the catalogoContadoresPage to set
	 */
	public void setCatalogoContadoresPage(
			CatalogoContadoresPage catalogoContadoresPage) {
		this.catalogoContadoresPage = catalogoContadoresPage;
	}

	
	public void  buscarContadores(){
		System.out.println("***********************************************buscarContadores");
		catalogoContadoresPage.setMuestraDataTable(Boolean.TRUE);
		
		
		catalogoContadoresPage.setContadores(new ArrayList<ContadorDataTableTO>());
		String [] names={"Pedro","Pablo","Luis","Jesus","Maria","Andres","Jesica","Reyna","Lea","Fabiola","Danae","Andrea","Laura"};
		String [] apellidos={"Cordova","Morales","Jimenez","Marquez","Costa","Peña","Rodriguez","Vazquez","Hernandez","Sandoval","Fuentes","Juarez","Martinez","Gonzalez","Lopez","Perez","Ruiz"};
	
		int datos=(int)(Math.random()*10+1);
		
		for(int i=0;i<datos;i++){
			ContadorDataTableTO cont=new ContadorDataTableTO();
			cont.setNombre(names[(int)(Math.random()*names.length)]);
			cont.setApPaterno(apellidos[(int)(Math.random()*names.length)]);
			cont.setApMaterno(apellidos[(int)(Math.random()*names.length)]);
			int años=(int)(Math.random()*60);
			int mes=(int)(Math.random()*12);
			mes++;
			int dia=(int)(Math.random()*28);
			dia++;
			cont.setCurp(cont.getApPaterno().substring(0, 2).concat(cont.getApMaterno().substring(0, 1)).concat(cont.getNombre().substring(0, 1)).concat(((""+(años+50)))).concat(""+mes).concat(""+dia));
			int imss=(int)(Math.random()*100000);
			cont.setRegistro(""+imss);
			cont.setEstatus( buscarEnCatalogoTO(catalogoContadoresPage.getStatus(),catalogoContadoresPage.getIdStatus()));
			cont.setDelegacion( buscarEnCatalogoTO(catalogoContadoresPage.getDelegacion(),catalogoContadoresPage.getIdDelegacion()));
			cont.setSubDelegacion( buscarEnCatalogoTO(catalogoContadoresPage.getSubdelegaccion(),catalogoContadoresPage.getIdSubDelegacion()));
			
			
			catalogoContadoresPage.getContadores().add(cont);
		}
		System.out.println("***********************************************buscarContadores===="+catalogoContadoresPage.getContadores().size());
	}

	private String buscarEnCatalogoTO(List<CatalogoTO>cat,Long id){
		String cad=null;
		
		if(cat!=null ){
			if(id==null){
				int idG=(int)(Math.random()*cat.size());
				idG++;
				id= new Long(idG);
			}
			for(CatalogoTO c:cat){
				if(c.getId().equals(id)){
					cad=c.getDescripcion();
					break;
				}
			}
		}
		return	cad;
	}

	

	/**
	 * @param inicioConfigurado the inicioConfigurado to set
	 */
	public void setInicioConfigurado(boolean inicioConfigurado) {
		catalogoContadoresPage.setInicioConfigurado(inicioConfigurado);
	}
	
	public void verDetalle( ContadorDataTableTO contadorDataTable )
	{
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////\n"
				+ "////////////////////////////////////////////////////////////////////////////////////////////////\n"
				+ "////////////////////////////////////////////////////////////////////////////////////////////////\n"
				+ "////////////////////////////////////////////////////////////////////////////////////////////////\n");
	  //Logic
	}	
}
