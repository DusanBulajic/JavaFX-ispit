package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.SecondStage;

public class PovratakController implements EventHandler<ActionEvent>{
	
	private SecondStage ss;

	public PovratakController(SecondStage ss) {
		super();
		this.ss = ss;
	}

	@Override
	public void handle(ActionEvent event) {
		ss.hide();
		
	}
	
	
}
