package mx.gob.imss.cit.de.dictaminacion.web.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;

import mx.gob.imss.cit.de.dictaminacion.web.constants.DictamenWebConstants;

/**
 * Servlet implementation class UploadFileDropZoneServlet
 */
@WebServlet("/UploadFileDropZoneServlet")
public class UploadFileDropZoneServlet extends HttpServlet  {
	
	private static final long serialVersionUID = 1L;
       
	private Logger LOG=Logger.getLogger(UploadFileDropZoneServlet.class) ;

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		  if (!ServletFileUpload.isMultipartContent(request)) {
		         throw new IllegalArgumentException("El request no soporta archivos");
		     }

		     ServletFileUpload uploadHandler = new ServletFileUpload(new DiskFileItemFactory());
		     PrintWriter writer = response.getWriter();
		   
		     LOG.info(request.getServletContext().getRealPath("/"));
		     try {
		         List<FileItem> items = uploadHandler.parseRequest(request);
		         
		         for (FileItem item : items) {
		             if (!item.isFormField()) {
	                     File file = new File(request.getServletContext().getRealPath("/"),DictamenWebConstants.NOMBREA_BASE_ARCHIVO_RP);
	                     item.write(file);
	
		             }
		         }
		     } catch (FileUploadException e) {
		             throw new RuntimeException(e);
		     } catch (Exception e) {
		             throw new RuntimeException(e);
		     } finally {
		        
		         writer.close();
		     }
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
	
}
