package org.mx.web.fileuploader.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FileUploader
 */
@WebServlet("/FileUploader")
public class FileUploader extends HttpServlet {
	private static final long serialVersionUID = 1L;
    static final String SAVE_DIR = "C:/Test/Upload/";
    static final int BUFFER_SIZE = 4096;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileUploader() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {     
       // Gets file name for HTTP header
       String fileName = request.getHeader("fileName");
       File saveFile = new File(SAVE_DIR + fileName);
        
       // prints out all header values
       System.out.println("===== Begin headers =====");
       Enumeration<String> names = request.getHeaderNames();
       while (names.hasMoreElements()) {
           String headerName = names.nextElement();
           System.out.println(headerName + " = " + request.getHeader(headerName));        
       }
       System.out.println("===== End headers =====\n");
        
       // opens input stream of the request for reading data
       InputStream inputStream = request.getInputStream();
        
       // opens an output stream for writing file
       FileOutputStream outputStream = new FileOutputStream(saveFile);
        
       byte[] buffer = new byte[BUFFER_SIZE];
       int bytesRead = -1;
       System.out.println("Receiving data...");
        
       while ((bytesRead = inputStream.read(buffer)) != -1) {
           outputStream.write(buffer, 0, bytesRead);
       }
        
       System.out.println("Data received.");
       outputStream.close();
       inputStream.close();
        
       System.out.println("File written to: " + saveFile.getAbsolutePath());
        
       // sends response to client
       response.getWriter().print("UPLOAD DONE");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
