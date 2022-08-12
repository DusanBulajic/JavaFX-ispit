package view;

import java.util.Collection;

import controller.PovratakController;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Obracun;

public class SecondStage extends Stage{

	private Label lbBroj = new Label("Broj izvodjaca po predmetu");
	private ListView<Obracun> lvObracun  =  new ListView<>();
	private Label lbRazredi = new Label("");
	private Button btnPovratak = new Button("Povratak");
	public SecondStage() {
	
		btnPovratak.setOnAction(new PovratakController(this));
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(lbBroj,lvObracun, lbRazredi, btnPovratak);
		
		Scene sc = new Scene(root,300,300);
		
		setScene(sc);
	}
	
	public void ubaciLv(Collection<Obracun> o) {
		lvObracun.getItems().clear();
		lvObracun.getItems().addAll(o);
		
	}
	/**
	 * @return the lbBroj
	 */
	public Label getLbBroj() {
		return lbBroj;
	}
	/**
	 * @param lbBroj the lbBroj to set
	 */
	public void setLbBroj(Label lbBroj) {
		this.lbBroj = lbBroj;
	}
	/**
	 * @return the lvObracun
	 */
	public ListView<Obracun> getLvObracun() {
		return lvObracun;
	}
	/**
	 * @param lvObracun the lvObracun to set
	 */
	public void setLvObracun(ListView<Obracun> lvObracun) {
		this.lvObracun = lvObracun;
	}
	/**
	 * @return the lbRazredi
	 */
	public Label getLbRazredi() {
		return lbRazredi;
	}
	/**
	 * @param lbRazredi the lbRazredi to set
	 */
	public void setLbRazredi(Label lbRazredi) {
		this.lbRazredi = lbRazredi;
	}
	/**
	 * @return the btnPovratak
	 */
	public Button getBtnPovratak() {
		return btnPovratak;
	}
	/**
	 * @param btnPovratak the btnPovratak to set
	 */
	public void setBtnPovratak(Button btnPovratak) {
		this.btnPovratak = btnPovratak;
	}
	
	
}
