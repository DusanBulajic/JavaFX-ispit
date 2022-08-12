package model;

public class Udzbenici {
	private String razred;
	private String izdavac;
	private String predmet;
	private String naslov;
	private String autroi;
	public Udzbenici(String razred, String izdavac, String predmet, String naslov, String autroi) {
		super();
		this.razred = razred;
		this.izdavac = izdavac;
		this.predmet = predmet;
		this.naslov = naslov;
		this.autroi = autroi;
	}
	/**
	 * @return the razred
	 */
	public String getRazred() {
		return razred;
	}
	/**
	 * @param razred the razred to set
	 */
	public void setRazred(String razred) {
		this.razred = razred;
	}
	/**
	 * @return the izdavac
	 */
	public String getIzdavac() {
		return izdavac;
	}
	/**
	 * @param izdavac the izdavac to set
	 */
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
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
	 * @return the naslov
	 */
	public String getNaslov() {
		return naslov;
	}
	/**
	 * @param naslov the naslov to set
	 */
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	/**
	 * @return the autroi
	 */
	public String getAutroi() {
		return autroi;
	}
	/**
	 * @param autroi the autroi to set
	 */
	public void setAutroi(String autroi) {
		this.autroi = autroi;
	}
	@Override
	public String toString() {
		return "Udzbenici [razred=" + razred + ", izdavac=" + izdavac + ", predmet=" + predmet + ", naslov=" + naslov
				+ ", autroi=" + autroi + "]";
	}
	
	
	
	
}
