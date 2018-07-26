package home.expenses.controllers;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import static javafx.application.Application.STYLESHEET_CASPIAN;
import static javafx.application.Application.STYLESHEET_MODENA;


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
	
	@FXML
	public void closeApplication(ActionEvent actionEvent) {
		Platform.exit();
		System.exit(0);
	}
	
	@FXML
	public void setCaspian(ActionEvent actionEvent) {
		Application.setUserAgentStylesheet(STYLESHEET_CASPIAN);
	}
	
	@FXML
	public void setModena(ActionEvent actionEvent) {
		Application.setUserAgentStylesheet(STYLESHEET_MODENA);
	}
	
	@FXML
	public  void setAlwaysOnTop(ActionEvent actionEvent) {
	}
	
	@FXML
	public void aboutApplication(ActionEvent actionEvent) {
	}
}
