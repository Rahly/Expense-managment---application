package home.expenses.controllers;

import javafx.fxml.FXML;

public class TopMenuButtonsController {
	
	private MainController mainController;
	
	
	@FXML
	public void onExpenses() {
		System.out.println("onExpenses");
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
