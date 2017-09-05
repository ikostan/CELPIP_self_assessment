/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Kostan Egor
 */
public class FormFXML extends Application {
    
	private final String TITLE = "CELPIP: Self Assesment Test Tool";
	private final int WIDTH = 600, HEIGHT =  450;	
	private Parent startPage, testPage;
	private StringBuilder error;
	
    @Override
    public void start(Stage stage) throws Exception {
       
    	error = new StringBuilder();
    	
    	prepareParent();
        
        Scene scene = new Scene(startPage, WIDTH, HEIGHT);
        stage.setTitle(TITLE);
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    //Prepare PARENT objects
    private void prepareParent(){
    	
    	try {
    		
			startPage = FXMLLoader.load(getClass().getResource("FXMLStart.fxml"));
	    	testPage = FXMLLoader.load(getClass().getResource("FXMLtest.fxml"));

		} catch (IOException e) {
			
			//TODO: show error message
			e.printStackTrace();
		}
    }

    
}
