package view;

import java.util.Collection;

import controller.DodajController;
import controller.FilterController;
import controller.IspisController;
import controller.PregledSController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Udzbenici;

public class MainStage extends Stage{

	private ComboBox<String> cbRazred = new ComboBox<>();
	private ComboBox<String> cbPredmet = new ComboBox<>();
	private ComboBox<String> cbIzdavaci = new ComboBox<>();
	private Button btnFilter = new Button("Filtriraj");
	private Button btnDodaj = new Button("Dodaj");
	private Button btnSnimi = new Button("Snimi");
	private Button btnPregled = new Button("Zbirni pregled");
	private TableView<Udzbenici> tvUdzbenici = new TableView<>();
	private Label lbRazred = new Label("Razred");
	private Label lbPredmet = new Label("Predmet");
	private Label lbIzdavac = new Label("Izdavac");
	private Label lbNaslov = new Label("Naslov");
	private Label lbAutori = new Label("Autori");
	private TextField tfRazred = new TextField();
	private TextField tfPredmet = new TextField();
	private TextField tfIzdavac = new TextField();
	private TextField tfNaslov = new TextField();
	private TextField tfAutori = new TextField();

	public MainStage() {
		
		btnFilter.setOnAction(new FilterController(this));
		btnDodaj.setOnAction(new DodajController(this));
		btnPregled.setOnAction(new PregledSController(this));
		btnSnimi.setOnAction(new IspisController(this));
		
		TableColumn<Udzbenici, String> tcRazred = new TableColumn<>("Razred");
		tcRazred.setCellValueFactory(new PropertyValueFactory<Udzbenici, String>("razred"));

		TableColumn<Udzbenici, String> tcIzdavac = new TableColumn<>("Izdavac");
		tcIzdavac.setCellValueFactory(new PropertyValueFactory<Udzbenici, String>("izdavac"));

		TableColumn<Udzbenici, String> tcPredmet = new TableColumn<>("Predmet");
		tcPredmet.setCellValueFactory(new PropertyValueFactory<Udzbenici, String>("predmet"));

		TableColumn<Udzbenici, String> tcnNaslov = new TableColumn<>("Naslov");
		tcnNaslov.setCellValueFactory(new PropertyValueFactory<Udzbenici, String>("Naslov"));

		TableColumn<Udzbenici, String> tcAutori = new TableColumn<>("Autori");
		tcAutori.setCellValueFactory(new PropertyValueFactory<Udzbenici, String>("autroi"));
	
		tvUdzbenici.getColumns().addAll(tcRazred, tcIzdavac, tcPredmet, tcnNaslov, tcAutori);
		
		VBox vbGore= new VBox(10);
		vbGore.setAlignment(Pos.CENTER);
		vbGore.getChildren().addAll(cbRazred, cbPredmet, cbIzdavaci, btnFilter);
		
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setVgap(10);
		gp.setHgap(10);
		gp.add(lbRazred, 0, 0);
		gp.add(tfRazred, 1, 0);
		gp.add(lbPredmet, 0, 1);
		gp.add(tfPredmet, 1, 1);
		gp.add(lbIzdavac, 0, 2);
		gp.add(tfIzdavac, 1, 2);
		gp.add(lbNaslov, 0, 3);
		gp.add(tfNaslov, 1, 3);
		gp.add(lbAutori, 0, 4);
		gp.add(tfAutori, 1, 4);
		
		HBox hbDole = new HBox(10);
		hbDole.setAlignment(Pos.CENTER);
		hbDole.getChildren().addAll(btnDodaj, btnSnimi, btnPregled);
		
		VBox root = new VBox(10);
		root.setPadding(new Insets(10));
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(vbGore, tvUdzbenici, gp, hbDole);
		
		Scene sc = new Scene(root,800, 600);
		setScene(sc);
		
	}
	
	public void ubaciPredmet(Collection<String> s) {
		
		cbPredmet.getItems().addAll(s);
		cbPredmet.getSelectionModel().select("Svi predmeti");
	}
	public void ubaciRazred(Collection<String> s) {
		
		cbRazred.getItems().addAll(s);
		cbRazred.getSelectionModel().select("Svi razredi");
	}
	public void ubaciIzdavace(Collection<String> s) {
		
		cbIzdavaci.getItems().addAll(s);
		cbIzdavaci.getSelectionModel().select("Svi izdavaci");
		
	}
	public void ubaciUdzbenike(Collection<Udzbenici> u) {
		tvUdzbenici.refresh();
		tvUdzbenici.getItems().clear();
		tvUdzbenici.getItems().addAll(u);
		
	}
	public void dodajU(Collection<Udzbenici> u) {
		tvUdzbenici.refresh();
		tvUdzbenici.getItems().addAll(u);
	}
	public void dodajIzdavace(String s) {
		cbIzdavaci.getItems().add(s);
	}
	public void dodajPredmet(String s) {
		cbPredmet.getItems().add(s);
	}
	public void dodajRazred(String s) {
		cbRazred.getItems().add(s);
	}

	/**
	 * @return the cbRazred
	 */
	public ComboBox<String> getCbRazred() {
		return cbRazred;
	}

	/**
	 * @param cbRazred the cbRazred to set
	 */
	public void setCbRazred(ComboBox<String> cbRazred) {
		this.cbRazred = cbRazred;
	}

	/**
	 * @return the cbPredmet
	 */
	public ComboBox<String> getCbPredmet() {
		return cbPredmet;
	}

	/**
	 * @param cbPredmet the cbPredmet to set
	 */
	public void setCbPredmet(ComboBox<String> cbPredmet) {
		this.cbPredmet = cbPredmet;
	}

	/**
	 * @return the cbIzdavaci
	 */
	public ComboBox<String> getCbIzdavaci() {
		return cbIzdavaci;
	}

	/**
	 * @param cbIzdavaci the cbIzdavaci to set
	 */
	public void setCbIzdavaci(ComboBox<String> cbIzdavaci) {
		this.cbIzdavaci = cbIzdavaci;
	}

	/**
	 * @return the btnFilter
	 */
	public Button getBtnFilter() {
		return btnFilter;
	}

	/**
	 * @param btnFilter the btnFilter to set
	 */
	public void setBtnFilter(Button btnFilter) {
		this.btnFilter = btnFilter;
	}

	/**
	 * @return the btnDodaj
	 */
	public Button getBtnDodaj() {
		return btnDodaj;
	}

	/**
	 * @param btnDodaj the btnDodaj to set
	 */
	public void setBtnDodaj(Button btnDodaj) {
		this.btnDodaj = btnDodaj;
	}

	/**
	 * @return the btnSnimi
	 */
	public Button getBtnSnimi() {
		return btnSnimi;
	}

	/**
	 * @param btnSnimi the btnSnimi to set
	 */
	public void setBtnSnimi(Button btnSnimi) {
		this.btnSnimi = btnSnimi;
	}

	/**
	 * @return the btnPregled
	 */
	public Button getBtnPregled() {
		return btnPregled;
	}

	/**
	 * @param btnPregled the btnPregled to set
	 */
	public void setBtnPregled(Button btnPregled) {
		this.btnPregled = btnPregled;
	}

	/**
	 * @return the tvUdzbenici
	 */
	public TableView<Udzbenici> getTvUdzbenici() {
		return tvUdzbenici;
	}

	/**
	 * @param tvUdzbenici the tvUdzbenici to set
	 */
	public void setTvUdzbenici(TableView<Udzbenici> tvUdzbenici) {
		this.tvUdzbenici = tvUdzbenici;
	}

	/**
	 * @return the lbRazred
	 */
	public Label getLbRazred() {
		return lbRazred;
	}

	/**
	 * @param lbRazred the lbRazred to set
	 */
	public void setLbRazred(Label lbRazred) {
		this.lbRazred = lbRazred;
	}

	/**
	 * @return the lbPredmet
	 */
	public Label getLbPredmet() {
		return lbPredmet;
	}

	/**
	 * @param lbPredmet the lbPredmet to set
	 */
	public void setLbPredmet(Label lbPredmet) {
		this.lbPredmet = lbPredmet;
	}

	/**
	 * @return the lbIzdavac
	 */
	public Label getLbIzdavac() {
		return lbIzdavac;
	}

	/**
	 * @param lbIzdavac the lbIzdavac to set
	 */
	public void setLbIzdavac(Label lbIzdavac) {
		this.lbIzdavac = lbIzdavac;
	}

	/**
	 * @return the lbNaslov
	 */
	public Label getLbNaslov() {
		return lbNaslov;
	}

	/**
	 * @param lbNaslov the lbNaslov to set
	 */
	public void setLbNaslov(Label lbNaslov) {
		this.lbNaslov = lbNaslov;
	}

	/**
	 * @return the lbAutori
	 */
	public Label getLbAutori() {
		return lbAutori;
	}

	/**
	 * @param lbAutori the lbAutori to set
	 */
	public void setLbAutori(Label lbAutori) {
		this.lbAutori = lbAutori;
	}

	/**
	 * @return the tfRazred
	 */
	public TextField getTfRazred() {
		return tfRazred;
	}

	/**
	 * @param tfRazred the tfRazred to set
	 */
	public void setTfRazred(TextField tfRazred) {
		this.tfRazred = tfRazred;
	}

	/**
	 * @return the tfPredmet
	 */
	public TextField getTfPredmet() {
		return tfPredmet;
	}

	/**
	 * @param tfPredmet the tfPredmet to set
	 */
	public void setTfPredmet(TextField tfPredmet) {
		this.tfPredmet = tfPredmet;
	}

	/**
	 * @return the tfIzdavac
	 */
	public TextField getTfIzdavac() {
		return tfIzdavac;
	}

	/**
	 * @param tfIzdavac the tfIzdavac to set
	 */
	public void setTfIzdavac(TextField tfIzdavac) {
		this.tfIzdavac = tfIzdavac;
	}

	/**
	 * @return the tfNaslov
	 */
	public TextField getTfNaslov() {
		return tfNaslov;
	}

	/**
	 * @param tfNaslov the tfNaslov to set
	 */
	public void setTfNaslov(TextField tfNaslov) {
		this.tfNaslov = tfNaslov;
	}

	/**
	 * @return the tfAutori
	 */
	public TextField getTfAutori() {
		return tfAutori;
	}

	/**
	 * @param tfAutori the tfAutori to set
	 */
	public void setTfAutori(TextField tfAutori) {
		this.tfAutori = tfAutori;
	}
	
	
	
}
