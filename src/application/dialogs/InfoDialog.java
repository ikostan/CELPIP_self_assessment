package application.dialogs;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
*
* @author Egor Kostan
*/

public class InfoDialog {

	private Alert alert;
	private final String TITLE = "Information Dialog";
	private final String headerTxt;
	private final String infoTxt;
	
	public InfoDialog(String headerTxt, String infoTxt){
		
		this.headerTxt = headerTxt;
		this.infoTxt = infoTxt;
	}
	
	public void showInfoDialog(){
		
		alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(TITLE);
		alert.setHeaderText(headerTxt);
		alert.setContentText(infoTxt);
		alert.showAndWait();
	}
	
}
