/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author Kostan Egor
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
