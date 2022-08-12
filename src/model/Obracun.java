package model;

public class Obracun {

	private String predmet;
	private int broj = 0 ;
	public Obracun(String predmet) {
		super();
		this.predmet = predmet;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return predmet + " - " + broj;
	}
	public void addBroj() {
		broj++;
	}
	/**
	 * @return the predmet
	 */
	public String getPredmet() {
		return predmet;
	}
	/**
	 * @param predmet the predmet to set
	 */
	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	/**
	 * @return the broj
	 */
	public int getBroj() {
		return broj;
	}
	/**
	 * @param broj the broj to set
	 */
	public void setBroj(int broj) {
		this.broj = broj;
	}
	
	
	
	
}
