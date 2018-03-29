package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	
	private VulkanizerskaRadnja v;
	private AutoGuma a;

	@Before
	public void setUp() throws Exception {
		v = new VulkanizerskaRadnja();
		a = new AutoGuma();
		
		a.setMarkaModel("abcd");
		a.setPrecnik(18);
		a.setSirina(150);
		a.setVisina(50);
	}

	@After
	public void tearDown() throws Exception {
		v = null;
		a = null;
	}

	@Test
	public void testDodajGumu() {
		v.dodajGumu(a);
		
		assertEquals(a, v.getGume().get(0));
	}
	
	@Test
	public void testDodajGumu2() {
		v.dodajGumu(a);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("efgh");
		a2.setPrecnik(18);
		a2.setSirina(150);
		a2.setVisina(50);
		
		v.dodajGumu(a2);
		
		assertEquals(a2, v.getGume().get(0));
	}
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		v.dodajGumu(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuIstu() {
		v.dodajGumu(a);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("abcd");
		a2.setPrecnik(18);
		a2.setSirina(150);
		a2.setVisina(50);
		
		v.dodajGumu(a2);
	}

	@Test
	public void testPronadjiGumu() {
		v.dodajGumu(a);
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("efgh");
		a2.setPrecnik(20);
		a2.setSirina(150);
		a2.setVisina(60);
		
		v.dodajGumu(a2);
		
		LinkedList<AutoGuma> nova = new LinkedList<>();
		nova = v.pronadjiGumu("abcd");
		
		assertEquals(1, nova.size());
		
	}
	
	@Test
	public void testPronadjiGumuNull() {
		v.dodajGumu(a);
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("efgh");
		a2.setPrecnik(20);
		a2.setSirina(150);
		a2.setVisina(60);
		
		v.dodajGumu(a2);
				
		assertEquals(null, v.pronadjiGumu(null));
		
	}
	
	
	@Test
	public void testPronadjiGumuVise() {
		v.dodajGumu(a);
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("efgh");
		a2.setPrecnik(20);
		a2.setSirina(150);
		a2.setVisina(60);
		
		v.dodajGumu(a2);
		
		AutoGuma a3 = new AutoGuma();
		a3.setMarkaModel("abcd");
		a3.setPrecnik(20);
		a3.setSirina(140);
		a3.setVisina(65);
		
		v.dodajGumu(a3);
		
		//Od 3 gume u listi 2 odgovaraju kriterijumu
		LinkedList<AutoGuma> nova = new LinkedList<>();
		nova = v.pronadjiGumu("abcd");
		
		assertEquals(2, nova.size());
		
	}

}
