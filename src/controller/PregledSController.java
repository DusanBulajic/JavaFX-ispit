package controller;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Database;
import model.Obracun;
import model.Udzbenici;
import view.MainStage;
import view.SecondStage;

public class PregledSController implements EventHandler<ActionEvent>{
	
	private MainStage ms;
	private Database db;
	public PregledSController(MainStage ms) {
		super();
		this.ms = ms;
		this.db = new Database();
	}
	@Override
	public void handle(ActionEvent event) {
		
		ArrayList<Obracun> res = new ArrayList<>();
		
		for(Udzbenici u : db.getUdzbenici()) {
			
			String predmet = u.getPredmet();
			
			Obracun obracun = null;
			for(Obracun o : res) {
				if(o.getPredmet().equals(predmet)) {
					obracun = o;
				}
			}
			if(obracun == null) {
				obracun = new Obracun(predmet);
				obracun.addBroj();
				res.add(obracun);
			}else {
				obracun.addBroj();
			}
			
		}
		Set<Integer> br = new TreeSet<Integer>();
		br.add(1);
		br.add(2);
		br.add(3);
		br.add(4);
		br.add(5);
		br.add(6);
		br.add(7);
		br.add(8);
		
		for(Udzbenici u : db.getUdzbenici()) {
			for(int i = 1; i<9 ; i++) {
				if(u.getRazred().equals(String.valueOf(i))){
					br.remove(i);
				}
			}
		}
		SecondStage ss = new SecondStage();
		
		ss.show();
		ss.ubaciLv(res);
		ss.getLbRazredi().setText("Razredi za koje nije unet ni jedan udzbenik: " + br);
		
		
		
	}
	
	
}
