package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import sun.tools.jar.resources.jar;

import Application.MesArmes.Batton;
import Application.MesEntites.Joueur;

public class JoueurTest {
	static final String NOM="test",NOM_2="test2";

	@Test
	public void testJoueur() {
		Joueur j=new Joueur(NOM);
		assertNotNull(j);
	}

	@Test
	public void testGetAtq() {
		//mes constatnte
		final float POINTS_ATTAQUE=200,POINTS_DEFENSE=400;
		
		//mes instances
		Joueur j=new Joueur(NOM);
		Joueur j2=new Joueur(NOM_2,new Batton(POINTS_ATTAQUE,POINTS_DEFENSE));


		//mes tests
		assertEquals(j.INITIAL_POINT_ATT, j.getAtq());
		assertEquals(POINTS_ATTAQUE+j2.INITIAL_POINT_ATT, j2.getAtq());
		
	}

	@Test
	public void testGetNom() {
		//mes constatnte		
		final float POINTS_ATTAQUE=100,POINTS_DEFENSE=100;

		//mes instances
		Joueur j=new Joueur(NOM);
		Joueur j2=new Joueur(NOM_2,new Batton(POINTS_ATTAQUE,POINTS_DEFENSE));
		
		//mes tests
		assertEquals(NOM, j.getNom());
	}

	@Test
	public void testSetNom() {
		
	}

	@Test
	public void testSetAtq() {
		final float POINTS=50;
		
		Joueur j=new Joueur(NOM);
		j.setAtq(POINTS);
		assertEquals(POINTS,j.getAtq());
	
	}

	@Test
	public void testBarrerAvecBatton() {
		fail("Not yet implemented");
	}

	@Test
	public void testFrapperAvecBatton() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDfs() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDfs() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
