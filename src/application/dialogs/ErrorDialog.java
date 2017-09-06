package application.dialogs;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
*
* @author Egor Kostan
*/

public class ErrorDialog {

	private Alert alert;
	private final String TITLE = "Error Dialog";
	private final String headerTxt;
	private final String errorTxt;
	
	public ErrorDialog(String headerTxt, String errorTxt){
		
		this.headerTxt = headerTxt;
		this.errorTxt = errorTxt;
	}
	
	public void showError(){
		
		alert = new Alert(AlertType.ERROR);
		alert.setTitle(TITLE);
		alert.setHeaderText(headerTxt);
		alert.setContentText(errorTxt);
	}
	
}
