package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AutoGumaTest {
	
	private AutoGuma a;

	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("abcd");
		
		assertEquals("abcd", a.getMarkaModel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelManjeOd3() {
		a.setMarkaModel("ab");
	}

	@Test
	public void testSetPrecnik() {
		a.setPrecnik(18);
		
		assertEquals(18, a.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeci() {
		a.setPrecnik(25);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManji() {
		a.setPrecnik(10);
	}

	@Test
	public void testSetSirina() {
		a.setSirina(150);
		
		assertEquals(150, a.getSirina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaVeca() {
		a.setSirina(100);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManja() {
		a.setSirina(400);
	}

	@Test
	public void testSetVisina() {
		a.setVisina(50);
		
		assertEquals(50, a.getVisina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVeca() {
		a.setVisina(100);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaManja() {
		a.setVisina(10);
	}

	@Test
	public void testToString() {
		a.setMarkaModel("abcd");
		a.setPrecnik(18);
		a.setSirina(150);
		a.setVisina(50);
		
		assertEquals("AutoGuma [markaModel=abcd, precnik=18, sirina=150, visina=50]", a.toString());
	}

	@Test
	public void testEqualsObject() {
		a.setMarkaModel("abcd");
		a.setPrecnik(18);
		a.setSirina(150);
		a.setVisina(50);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("abcd");
		a2.setPrecnik(18);
		a2.setSirina(150);
		a2.setVisina(50);
		
		assertTrue(a.equals(a2));
	}

	@Test
	public void testEqualsObject1() {
		a.setMarkaModel("abcd");
		a.setPrecnik(18);
		a.setSirina(150);
		a.setVisina(50);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("efgh");
		a2.setPrecnik(18);
		a2.setSirina(150);
		a2.setVisina(50);
		
		assertFalse(a.equals(a2));
	}


}
