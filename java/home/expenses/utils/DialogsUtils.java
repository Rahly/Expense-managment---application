package home.expenses.utils;

import java.util.Optional;
import java.util.ResourceBundle;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;

public class DialogsUtils {
	
	static ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");
	
	public static void dialogAboutApplication() {
		Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
		informationAlert.setTitle(bundle.getString("about.title"));
		informationAlert.setHeaderText(bundle.getString("about.header"));
		informationAlert.setContentText(bundle.getString("about.content"));
		informationAlert.showAndWait();
	}
	
	public static Optional<ButtonType> confirmationDialog() {
		Alert confirmationDialog = new Alert(Alert.AlertType.CONFIRMATION);
		confirmationDialog.setTitle(bundle.getString("exit.title"));
		confirmationDialog.setHeaderText(bundle.getString("exit.header"));
		Optional<ButtonType> result = confirmationDialog.showAndWait();
		return result;
	}
	
	public static void errorDialog(String error) {
		Alert errorAlert = new Alert(Alert.AlertType.ERROR);
		errorAlert.setTitle(bundle.getString("error.title"));
		errorAlert.setHeaderText(bundle.getString("error.header"));
		
		TextArea textArea = new TextArea(error);
		errorAlert.getDialogPane().setContent(textArea);
		
		errorAlert.showAndWait();
	}
}
