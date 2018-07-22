package home.expenses.controllers;

import javafx.fxml.FXML;

public class TopMenuButtonsController {
	
	private MainController mainController;
	
	
	@FXML
	public void addExpenses() {
		System.out.println("addExpenses");
	}
	
	@FXML
	public void openListExpenses() {
		System.out.println("openListExpenses");
	}
	
	@FXML
	public void openStatistics() {
		System.out.println("openStatistics");
	}

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}
	
	
}
