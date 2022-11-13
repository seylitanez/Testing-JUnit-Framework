/**
 * 
 */
package Application.MesEntites;
import Application.MesActions.ActionsJoueur;
import Application.MesArmes.Batton;
import Application.MesArmes.BattonBois;

/**
 * @author ASUS
 *
 */
public class Joueur implements ActionsJoueur{
	//mes const
	public final float INITIAL_POINT_ATT=1;
	public final float INITIAL_POINT_DEF=1;
	//mes attributs
	private float atq=INITIAL_POINT_ATT;
	private float dfs=INITIAL_POINT_DEF;
	private String nom;
	/**
	 * 
	 * @param nom
	 * @param arme
	 * constructeur
	 */
	public Joueur(String nom,Batton arme) {
		this.nom=nom;
		frapperAvecBatton(arme);
		BarrerAvecBatton(arme);
	}
	public Joueur(String nom) {
		this.nom=nom;
	}

	/*
	 * getter/setter
	 */
	public float getAtq() {
		return atq;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setAtq(float atq) {
		this.atq = atq;
	}

	
	@Override
	public void BarrerAvecBatton(Batton typebatton) {
		setDfs(getDfs()+typebatton.getDef());
	}

	@Override
	public void frapperAvecBatton(Batton typebatton) {
		setAtq(getAtq()+typebatton.getAtq());
		
	}
	public float getDfs() {
		return dfs;
	}
	
	public void setDfs(float dfs) {
		this.dfs = dfs;
	}
	/**
	 * to string methode
	 */
	public String toString(){
		return "________________\nnom:"+getNom()+"\t|\nattaque:"+getAtq()+"\t|\ndefense:"+getDfs()+"\t|\n________________|\n";
	}


}
