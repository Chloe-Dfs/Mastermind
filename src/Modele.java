
public class Modele {
	
	
	int N_TENTATIVES = 10;
	static int DIFFICULTE = 4;
	String [] COULEURS = { "Jaune", "Vert", "Bleu", "Magenta", "Rouge", "Orange", "Blanc", "Noir"};
	public enum Etat {
		EN_COURS, GAGNE, PERDU
		}
	
	Etat enCours = Etat.EN_COURS;
	Etat gagne = Etat.GAGNE;
	Etat perdu = Etat.PERDU;
	
	Etat etat;
	Range combinaison;
	Range[] propositions;
	int tentative;
	//propositions[tentative]

}
