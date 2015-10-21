package mx.gob.imss.cit.de.dictaminacion.web.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PatronAsociadoDTO;

/**
 * Servlet implementation class UploadFileDropZoneServlet
 */
@WebServlet("/UploadFileDropZoneServlet")
public class UploadFileDropZoneServlet extends HttpServlet  {
	private static final long serialVersionUID = 1L;
       
 
    public UploadFileDropZoneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		  if (!ServletFileUpload.isMultipartContent(request)) {
		         throw new IllegalArgumentException("Request is not multipart, please 'multipart/form-data' enctype for your form.");
		     }

		     ServletFileUpload uploadHandler = new ServletFileUpload(new DiskFileItemFactory());
		     PrintWriter writer = response.getWriter();
		   
		     System.out.println(request.getServletContext().getRealPath("/"));
		     try {
		         List<FileItem> items = uploadHandler.parseRequest(request);
		         
		         for (FileItem item : items) {
		             if (!item.isFormField()) {
	                     File file = new File(request.getServletContext().getRealPath("/"), "registroPatronal.txt");
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
