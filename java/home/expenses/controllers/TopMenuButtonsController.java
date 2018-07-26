package home.expenses.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {
	
	public static final String ADD_EXPENSES_FXML = "/fxml/AddExpenses.fxml";
	public static final String STATISTICS_FXML = "/fxml/Statistics.fxml";
	public static final String LIST_EXPENSES_FXML = "/fxml/ListExpenses.fxml";
	public static final String EXPENSES_FXML = "/fxml/Expenses.fxml";

	private MainController mainController;
	
	@FXML 
	private ToggleGroup toggleButtons;
	
	@FXML
	public void onExpenses() {
		mainController.setCenter(EXPENSES_FXML);
	}
	
	@FXML
	public void openListExpenses() {
		mainController.setCenter(LIST_EXPENSES_FXML);
	}
	
	@FXML
	public void openStatistics() {
		mainController.setCenter(STATISTICS_FXML);
	}
	
	@FXML
	public void addExpenses() {
		if(toggleButtons.getSelectedToggle()!=null) {
			toggleButtons.getSelectedToggle().setSelected(false);
		}
		mainController.setCenter(ADD_EXPENSES_FXML);
	}

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}
	
	
}
