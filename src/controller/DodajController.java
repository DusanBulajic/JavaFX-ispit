package controller;

import java.util.ArrayList;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Database;
import model.Udzbenici;
import view.MainStage;

public class DodajController implements EventHandler<ActionEvent>{

	private MainStage ms;
	private Database db;
	public DodajController(MainStage ms) {
		super();
		this.ms = ms;
		this.db = new Database();
	}
	@Override
	public void handle(ActionEvent event) {
		int razred = Integer.parseInt(ms.getTfRazred().getText());
		String predmet = ms.getTfRazred().getText();
		String izdavac = ms.getTfIzdavac().getText();
		String autori = ms.getTfAutori().getText();
		String naslov = ms.getTfNaslov().getText();
		
		ObservableList<Udzbenici> svi = ms.getTvUdzbenici().getItems();
		
		svi.add(new Udzbenici(String.valueOf(razred), izdavac, predmet, naslov, autori));
		
	//	ms.dodajU(svi);
		ms.dodajPredmet(predmet);
		ms.dodajRazred(String.valueOf(razred));
		ms.dodajIzdavace(izdavac);
	}
	
	
}
