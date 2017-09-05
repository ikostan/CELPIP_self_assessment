package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.stage.Stage;

/**
 *
 * @author Egor Kostan
 */

public class FormFXML extends Application {
    
	private final String TITLE = "CELPIP: Self Assesment Test Tool";
	private final int WIDTH = 700, HEIGHT =  450;	
	
	private Scene scene;
	
	private Parent startPage, testPage;
	private StringBuilder error;
	
	private MenuBar menuBar;
	private Menu menuFile, menuPreferences, menuHelp;
	
	
    @Override
    public void start(Stage stage) throws Exception {
       
    	error = new StringBuilder();
    	
    	setMenu();
    	prepareParent();
    	
    	
        scene = new Scene(startPage, WIDTH, HEIGHT);  
  
        stage.setTitle(TITLE);
        stage.setScene(scene);
        //stage.setResizable(false);
        stage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    //Create menu items
    private void setMenu(){
    	
    	//Menu Bar
    	menuBar = new MenuBar();
   	 
    	//Menu Items
        menuFile = new Menu("File");
        menuPreferences = new Menu("Preferences"); 
        menuHelp = new Menu("Help"); 
        
        //Add menu items to the menu
        menuBar.getMenus().addAll(menuFile, menuPreferences, menuHelp);
    }
    
    
    //Add menu items to the main scene
    private void addMenu(){
    	
    }
    
    
    //Prepare PARENT objects
    private void prepareParent(){
    	
    	try {
    		
			startPage = FXMLLoader.load(getClass().getResource("\\fxml_files\\FXMLStart.fxml"));
	    	testPage = FXMLLoader.load(getClass().getResource("\\fxml_files\\FXMLtest.fxml"));

		} catch (IOException e) {
			
			//TODO: show error message
			e.printStackTrace();
		}
    }

    
}
