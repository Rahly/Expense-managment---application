package home.expenses.controllers;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class MainController {
	
	@FXML
	private BorderPane borderPane;
	
	@FXML 
	private TopMenuButtonsController topMenuButtonsController;
	
	@FXML
	private void initialize() {
		topMenuButtonsController.setMainController(this);
	}
	
	@FXML 
	public void setCenter(String fxmlPath) {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource(fxmlPath));
		ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");
		loader.setResources(bundle);
		Parent parent = null;
		try {
			parent = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		borderPane.setCenter(parent);
	}
}
