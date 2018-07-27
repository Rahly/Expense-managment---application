package home.expenses.main;

import java.util.ResourceBundle;

import home.expenses.utils.FxmlUtils;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{

	public static final String BORDER_PANE_MAIN_FXML = "/fxml/BorderPaneMain.fxml";

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Pane borderPane = FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);
		
		Scene scene = new Scene(borderPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle(FxmlUtils.getResourcesBundle().getString("title.application"));
		primaryStage.show();
		primaryStage.setResizable(false);		
	}

}
