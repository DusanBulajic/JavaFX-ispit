package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import model.Database;
import view.MainStage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Database db = new Database();
		MainStage ms = new MainStage();
		
		ms.show();
		ms.ubaciIzdavace(db.getIzdavaci());
		ms.ubaciRazred(db.getRazredi());
		ms.ubaciPredmet(db.getPredmete());
		ms.ubaciUdzbenike(db.getUdzbenici());
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
