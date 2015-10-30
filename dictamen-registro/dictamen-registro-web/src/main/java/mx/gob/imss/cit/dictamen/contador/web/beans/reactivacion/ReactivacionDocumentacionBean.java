package mx.gob.imss.cit.dictamen.contador.web.beans.reactivacion;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
 



import org.apache.log4j.Logger;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;


@ManagedBean(name = "reactivacionDocumentacionBean")
@ViewScoped
public class ReactivacionDocumentacionBean extends BaseBean  {

	private static final long serialVersionUID = -595496301504928310L;

	private static final Logger LOGGER = Logger.getLogger(ReactivacionDocumentacionBean.class);
	
	

	private UploadedFile fileAcreditacionMembresia;
    private UploadedFile fileCertificacionVigente;
    private UploadedFile fileOpinionIMSS;
    private UploadedFile fileOpinionSAT;




	public void upload() {
		
	
		/*
        if(file != null) {
            FacesMessage message = new FacesMessage("Succesful", file.getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, message);
            LOGGER.info("event.getFile().getFileName()="+file.getFileName());
        }else{
            LOGGER.info("event.getFile().getFileName().isempty");

        }*/
    }
    
  
    
	public void upload2(FileUploadEvent event) {  
		
		
        FacesMessage msg = new FacesMessage("Success! ", event.getFile().getFileName() + " is uploaded.");  
        FacesContext.getCurrentInstance().addMessage(null, msg);
        // Do what you want with the file        
     
           // copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
            LOGGER.info("event.getFile().getFileName()="+event.getFile().getFileName());

 
    }  
	
	

    public UploadedFile getFileAcreditacionMembresia() {
		return fileAcreditacionMembresia;
	}



	public void setFileAcreditacionMembresia(UploadedFile fileAcreditacionMembresia) {
		this.fileAcreditacionMembresia = fileAcreditacionMembresia;
	}



	public UploadedFile getFileCertificacionVigente() {
		return fileCertificacionVigente;
	}



	public void setFileCertificacionVigente(UploadedFile fileCertificacionVigente) {
		this.fileCertificacionVigente = fileCertificacionVigente;
	}



	public UploadedFile getFileOpinionIMSS() {
		return fileOpinionIMSS;
	}



	public void setFileOpinionIMSS(UploadedFile fileOpinionIMSS) {
		this.fileOpinionIMSS = fileOpinionIMSS;
	}



	public UploadedFile getFileOpinionSAT() {
		return fileOpinionSAT;
	}



	public void setFileOpinionSAT(UploadedFile fileOpinionSAT) {
		this.fileOpinionSAT = fileOpinionSAT;
	}


	
}
