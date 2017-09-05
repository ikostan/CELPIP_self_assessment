
package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

/**
*
* @author Egor Kostan
*/
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML 
    private Text actiontarget;
    
    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
    	
        actiontarget.setText("'Start a new test' button activated");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
