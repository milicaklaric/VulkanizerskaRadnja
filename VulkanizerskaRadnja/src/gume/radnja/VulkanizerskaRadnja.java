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
	 * Dodavanje nove gume u radnju
	 * 
	 * @param a nova guma koja se dodaje
	 * 
	 * @throws NullPointerException ukoliko je parametar null
	 * 
	 * @throws RuntimeException ukoliko guma vec postoji u radnji
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
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
		
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		
		return novaLista;
	}
}