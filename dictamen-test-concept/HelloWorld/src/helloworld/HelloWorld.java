package helloworld;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    static final String UPLOAD_URL = "http://localhost:8080/org.mx.web.fileuploader/FileUploader";
    static final int BUFFER_SIZE = 4096;
    
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 551, 400);
        scene.setOnDragOver(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                Dragboard db = event.getDragboard();
                if (db.hasFiles()) {
                    event.acceptTransferModes(TransferMode.COPY);
                } else {
                    event.consume();
                }
            }
        });
        
        // Dropping over surface
        scene.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (db.hasFiles()) {
                    success = true;
                    String filePath;
                    for (File file:db.getFiles()) {
                        filePath = file.getAbsolutePath();
                        System.out.println(filePath);
                        try {
                            save(filePath);
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(HelloWorld.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(HelloWorld.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                event.setDropCompleted(success);
                event.consume();
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void save(String filePath) throws MalformedURLException, IOException{
        File uploadFile = new File(filePath);
 
        System.out.println("File to upload: " + filePath);
 
        // creates a HTTP connection
        URL url = new URL(UPLOAD_URL);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        httpConn.setUseCaches(false);
        httpConn.setDoOutput(true);
        httpConn.setRequestMethod("POST");
        // sets file name as a HTTP header
        httpConn.setRequestProperty("fileName", uploadFile.getName());
 
        OutputStream outputStream;
        outputStream = httpConn.getOutputStream();
 
        FileInputStream inputStream;
        inputStream = new FileInputStream(uploadFile);
 
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead;
        bytesRead = -1;
 
        System.out.println("Start writing data...");
 
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
 
        System.out.println("Data was written.");
        outputStream.close();
        inputStream.close();
 
        // always check HTTP response code from server
        int responseCode = httpConn.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            // reads server's response
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    httpConn.getInputStream()));
            String response = reader.readLine();
            System.out.println("Server's response: " + response);
        } else {
            System.out.println("Server returned non-OK code: " + responseCode);
        }        
    }
}