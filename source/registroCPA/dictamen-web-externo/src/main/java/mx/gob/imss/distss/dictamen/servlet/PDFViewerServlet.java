package mx.gob.imss.distss.dictamen.servlet;

import java.io.BufferedOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PDFViewerServlet extends HttpServlet {
	
	private static final long serialVersionUID = -2544010404983900663L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
//		File file = new File("C://archivos","documento.pdf");
        response.setContentType(getServletContext().getMimeType("reporte.pdf"));
        //response.setContentLength((int) file.length());
        response.setHeader("Content-Disposition","inline;filename=\"reporte.pdf\"");
        //BufferedInputStream input = null;
        BufferedOutputStream output = null;
        byte[] byteArray = null;
        try{
        	
        	byteArray = (byte[]) request.getSession().getAttribute("byteArray");
        	
        	response.setContentLength(byteArray.length);
        	
            //input=new BufferedInputStream(new FileInputStream(file));
           output=new BufferedOutputStream(response.getOutputStream());
            //byte[] buffer=new byte[8192];
            //int length;
            //while((length=input.read(buffer))>0){
                //output.write(buffer,0,length);
            //}
            ///for(int i=0;i<byteArray.length;i++){
            	output.write(byteArray);
            //}
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if (output!=null)output.close();
            //if (input!=null)input.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
}
