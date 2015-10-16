package mx.gob.imss.distss.dictamen.controller.v2;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import javax.servlet.http.HttpServletResponse;

import mx.gob.imss.distss.dictamen.utils.FileMeta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping("/fileUpload/controller")
public class FileUploadController {
	
	private static final Logger logger = LoggerFactory.getLogger(FileUploadController.class);
	
    FileMeta fileMeta = null;

    @RequestMapping(value="/guardarDocumentoAdjunto", method = RequestMethod.POST)
    public @ResponseBody LinkedList<FileMeta> upload(MultipartHttpServletRequest request, HttpServletResponse response) {
    	logger.info("Me encuentro en el controller FileUploadController, en el metodo guardarDocumentoAdjunto.");
        LinkedList<FileMeta> files = new LinkedList<FileMeta>();
        Iterator<String> itr =  request.getFileNames();
        MultipartFile mpf = null;
        while (itr.hasNext()) {
            mpf = request.getFile(itr.next());
            System.out.println(mpf.getOriginalFilename() +" uploaded! "+files.size());
            if (files.size() >= 10) {
                files.pop();
            }
            fileMeta = new FileMeta();
            fileMeta.setFileName(mpf.getOriginalFilename());
            fileMeta.setFileSize(mpf.getSize()/1024+" Kb");
            fileMeta.setFileType(mpf.getContentType());
            try {
                fileMeta.setBytes(mpf.getBytes());
                //ejemplo para copiar archivo a file system
                //FileCopyUtils.copy(mpf.getBytes(), new FileOutputStream("D:/temp/files/"+mpf.getOriginalFilename()));

            } catch (IOException ex) {
                ex.printStackTrace();
            }
            files.add(fileMeta);
        }
        // ejemplo de respuesta
        // [{"fileName":"app_engine-85x77.png","fileSize":"8 Kb","fileType":"image/png"},...]
        return files;
    }

    /*
    @RequestMapping(value = "/get/{value}", method = RequestMethod.GET)
    public void get(HttpServletResponse response,@PathVariable String value){
        FileMeta getFile = files.get(Integer.parseInt(value));
        try {
            response.setContentType(getFile.getFileType());
            response.setHeader("Content-disposition", "attachment; filename=\""+getFile.getFileName()+"\"");
            FileCopyUtils.copy(getFile.getBytes(), response.getOutputStream());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}