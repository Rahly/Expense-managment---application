package home.expenses.utils;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class FxmlUtils {

	public static Pane fxmlLoader(String fxmlPath) {
		
		FXMLLoader loader = new FXMLLoader(FxmlUtils.class.getResource(fxmlPath));
		loader.setResources(getResourcesBundle());
		try {
			return loader.load();
		} catch (Exception e) {
			DialogsUtils.errorDialog(e.getMessage());
		}
		return null;		
	}
	
	public static ResourceBundle getResourcesBundle() {
		return ResourceBundle.getBundle("bundles.messages");
	}
}
