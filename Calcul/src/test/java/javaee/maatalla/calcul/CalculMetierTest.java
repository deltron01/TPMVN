package javaee.maatalla.calcul;

import junit.framework.TestCase;

public class CalculMetierTest extends TestCase {
    // declarer un attribut classe que l'on veut tester.
	private CalculMetier metier;
	
	protected void setUp() throws Exception {// c'est la method qui s'execute au moment de l'initialisation
		super.setUp();
		metier = new CalculMetier();
	}
	
	public void testSomme(){
		assertTrue(metier.somme(9, 10) == 19);
	}
	public void testProduit(){
		assertTrue(metier.produit(9, 10) == 90);
	}

}
