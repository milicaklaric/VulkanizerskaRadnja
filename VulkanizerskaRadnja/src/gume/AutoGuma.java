package gume;

/**
 * Klasa predstavlja auto gumu
 * 
 * @author Milica Klaric
 * @version 1.0
 */

public class AutoGuma {
	
	/**
	 * Marka i model gume 
	 */
	private String markaModel = null;
	
	/**
	 * Precnik gume
	 */
	private int precnik = 0;
	
	/**
	 * Sirina gume
	 */
	private int sirina = 0;
	
	/**
	 * Visina gume
	 */
	private int visina = 0;

	
	/**
	 * Vraca marku i modde gume
	 * @return marka i model gume
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	
	/**
	 * Postavlja novu vrednost marke i modela gume
	 * 
	 * @param markaModel nova vrednost marke i modela
	 * 
	 * @throws RuntimeException ukoliko je parametar null ili 
	 * ima manje od 3 karaktera
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	
	/**
	 * Vraca precnik gume
	 * @return precnik gume
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja novu vrednost atributa precnik
	 * 
	 * @param precnik nova vrednost precnika gume
	 * 
	 * @throws RuntimeException ukoliko je precnik manji od 13 ili veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	
	/**
	 * Vraca sirinu gume
	 * @return sirina gume
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja novu vrednost atributa sirina
	 * 
	 * @param sirina nova vrednost sirine gume
	 * 
	 * @throws RuntimeException ukoliko je sirina manja od 135 ili veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca visinu gume
	 * @return visina gume
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja novu vrednost atributa visina
	 * 
	 * @param visina nova vrednost visine gume
	 * 
	 * @throws RuntimeException ukoliko je visina manja od 25 ili veca od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Vraca String sa svim podacima o gumi
	 * @return String sa svim podacim o gumi
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	
	/**
	 * Poredi da li su dve gume  iste u odnosu na sve njihove atribute
	 * @return true ukoliko gume imaju sve iste atribute,
	 * false u suprotnom
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}