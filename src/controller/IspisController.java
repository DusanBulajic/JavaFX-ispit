package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Database;
import view.MainStage;

public class IspisController implements EventHandler<ActionEvent>{
	
	private MainStage ms;
	private Database db;
	public IspisController(MainStage ms) {
		super();
		this.ms = ms;
		this.db = new Database();
	}
	@Override
	public void handle(ActionEvent event) {
		String razred = ms.getTfRazred().getText();
		String predmet = ms.getTfRazred().getText();
		String izdavac = ms.getTfIzdavac().getText();
		String autori = ms.getTfAutori().getText();
		String naslov = ms.getTfNaslov().getText();
		try {
			FileWriter fw = new FileWriter("udzbenici.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(razred + ". Razred-"+predmet);
			pw.println(izdavac);
			pw.print(naslov+"," + autori);
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
