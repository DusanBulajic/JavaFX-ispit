package controller;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Database;
import model.Udzbenici;
import view.MainStage;

public class FilterController implements EventHandler<ActionEvent>{

	private MainStage ms;
	private Database db;
	public FilterController(MainStage ms) {
		super();
		this.ms = ms;
		this.db = new Database();
	}
	@Override
	public void handle(ActionEvent event) {
		String razred = ms.getCbRazred().getSelectionModel().getSelectedItem();
		String predmet = ms.getCbPredmet().getSelectionModel().getSelectedItem();
		String izdavac = ms.getCbIzdavaci().getSelectionModel().getSelectedItem();
		
		ArrayList<Udzbenici> res = new ArrayList<>();
		
		for(Udzbenici u : db.getUdzbenici()) {
			if(razred.equals(u.getRazred()) && predmet.equals(u.getPredmet()) && izdavac.equals(u.getIzdavac())) {
				res.add(u);
			}else if(razred.equals("Svi razredi") && predmet.equals(u.getPredmet()) && izdavac.equals(u.getIzdavac())) {
				res.add(u);
			}else if(razred.equals("Svi razredi") && predmet.equals("Svi predmeti") && izdavac.equals(u.getIzdavac())) {
				res.add(u);
			}else if(razred.equals("Svi razredi") && predmet.equals("Svi predmeti") && izdavac.equals("Svi izdavaci")) {
				res.add(u);
			}else if(razred.equals(u.getRazred()) && predmet.equals("Svi predmeti") && izdavac.equals("Svi izdavaci")) {
				res.add(u);
			}else if(razred.equals(u.getRazred()) && predmet.equals(u.getPredmet()) && izdavac.equals("Svi izdavaci")) {
				res.add(u);
			}else if(razred.equals(u.getRazred()) && predmet.equals("Svi predmeti") && izdavac.equals(u.getIzdavac())) {
				res.add(u);
			}
			ms.ubaciUdzbenike(res);
			
			
			
			
			
		}
		
	}
	
	
	
}
