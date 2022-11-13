package Application.Starter;

import Application.MesArmes.Batton;
import Application.MesArmes.BattonBois;
import Application.MesArmes.BattonFer;
import Application.MesEntites.Joueur;

public class Luncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Joueur joueur1=new Joueur("lyes",new BattonBois());
		Joueur joueur2=new Joueur("yacine",new BattonFer());
		Joueur joueur3=new Joueur("test");
		System.out.println(joueur1);
		System.out.println(joueur2);
		System.out.println(joueur3);
		
	
	}

}
