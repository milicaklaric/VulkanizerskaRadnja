package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;


/**
 * Klasa predstavlja vulkanizersku radnju
 * 
 * @author Milica Klaric
 * @version 1.0
 */
public class VulkanizerskaRadnja {
	
	/**
	 * Lista guma koje se nalaze u ranji
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Dodavanje nove gume u radnju i to na pocetak liste
	 * 
	 * @param a nova guma koja se dodaje
	 * 
	 * @throws NullPointerException ukoliko je parametar a null
	 * 
	 * @throws RuntimeException ukoliko guma a vec postoji u radnji
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		
		if (getGume().contains(a))
			throw new RuntimeException("Guma vec postoji");
		
		getGume().addFirst(a);
	}

	/**
	 * Pronalazi gumu zadate marke i modela u radnji
	 * @param markaModel marka i model koji trazimo u radnji
	 * 
	 * @return Lista guma zadate marke i modela,
	 * null ukoliko je parametar null 
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		
		for (int i = 0; i < getGume().size(); i++)
			if (getGume().get(i).getMarkaModel().equals(markaModel))
				novaLista.add(getGume().get(i));
		
		return novaLista;
	}

	//Naknadno dodato zbog Test klase
	public LinkedList<AutoGuma> getGume() {
		return gume;
	}
}