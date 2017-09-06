package application.dialogs;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

/**
*
* @author Egor Kostan
*/

public class ExceptionDialog {
	
	private Alert alert;
	private final String TITLE = "Exception Dialog";
	private String headerTxt;
	private String errorTxt;
	private String exceptionText;
	
	private Label label;
	private TextArea textArea;
	private GridPane expContent;
	
	
	public ExceptionDialog(String headerTxt, String errorTxt, String exceptionText){
		
		 this.headerTxt = headerTxt;
		 this.errorTxt = errorTxt;
		 this.exceptionText = exceptionText;
		 
		 label = new Label("The exception stacktrace was:");
		 textArea = new TextArea(exceptionText);
		 expContent = new GridPane();
	}
	
	public void showException(){
		
		alert = new Alert(AlertType.ERROR);
		alert.setTitle(TITLE);
		alert.setHeaderText(headerTxt);
		alert.setContentText(errorTxt);
		
		setExceptionMessage();
		
		// Set expandable Exception into the dialog pane.
		alert.getDialogPane().setExpandableContent(expContent);
		alert.showAndWait();
	}

	// Create expandable Exception.
	//StringWriter sw = new StringWriter();
	//PrintWriter pw = new PrintWriter(sw);
	//ex.printStackTrace(pw);
	//String exceptionText = sw.toString();

	
	private void setExceptionMessage(){
		
		textArea.setEditable(false);
		textArea.setWrapText(true);
		textArea.setMaxWidth(Double.MAX_VALUE);
		textArea.setMaxHeight(Double.MAX_VALUE);
		
		GridPane.setVgrow(textArea, Priority.ALWAYS);
		GridPane.setHgrow(textArea, Priority.ALWAYS);
		
		expContent.setMaxWidth(Double.MAX_VALUE);
		expContent.add(label, 0, 0);
		expContent.add(textArea, 0, 1);
	}

}
