package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


import view.SecondStage;

public class Database {
	
	public Collection<Udzbenici> getUdzbenici(){
		ArrayList<Udzbenici> udzbenici = new ArrayList<>();
		 try {
			 BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("udzbenici.txt"), "UTF8"));
			 String line = br.readLine();
			 
			
			 
			 while(line != null && line.contains("-")) {
			
				 String[] deo = line.split("-");
		
				
				 
				 String[] raz = deo[0].split("");
				 
				 String razred = raz[0];
				 
				 String predmet = deo[1];
				 
				 String izdavac = "";
				 
				 line = br.readLine();
				 
				 while(line != null && line.contains("-") == false && line.contains(",") == false) {
					 izdavac =  line;
					
					 line = br.readLine();
				
					 while(line != null && line.contains(",")) {
					 	
					 	String[] args = line.split(",");
					 	String naslov = args[0];
					 	String autori = args[1];
					 	for(int i = 2; i<args.length ; i++) {
					 		 autori += ","+args[i];
					 	}
					 	
					
					 	line = br.readLine();
					
					 	udzbenici.add(new Udzbenici(razred, izdavac, predmet, naslov, autori));
					 }
				 }
				
			 }
			 
			 br.close();
		 
		 } catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return udzbenici;
		
	}
	public Collection<String> getPredmete(){
		
		Set<String> res = new HashSet<String>();
		
		res.add("Svi predmeti");
		
		for(Udzbenici u : getUdzbenici()) {
			res.add(u.getPredmet());
		}
		
		return res;
	}
	
	public Collection<String> getRazredi(){
		
		Set<String> res = new HashSet<String>();
		
		res.add("Svi razredi");
		
		for(Udzbenici u : getUdzbenici()) {
			res.add(u.getRazred());
		}
		
		return res;
		
		
	}
	
	public Collection<String> getIzdavaci(){
		
		Set<String> res = new HashSet<String>();
		
		res.add("Svi izdavaci");
		
		for(Udzbenici u : getUdzbenici()) {
			res.add(u.getIzdavac());
		}
		
		return res;
		
		
	}
	
}
