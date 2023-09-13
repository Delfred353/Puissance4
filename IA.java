package Puissance4;
import java.util.concurrent.ThreadLocalRandom;

public class IA{
	
	static int[][] CopieGrille = new int [6][7];
	static int joueur;
	
	public IA() {
		joueur = 2;
	}
	
	
	public static int entierAleatoire(int a, int b){
		//Retourne un entier aléatoire entre a (inclus) et b (inclus)
		return ThreadLocalRandom.current().nextInt(a, b + 1);	
	}
	
	public static boolean colonneEstLibre(int c) {
		//retourne un booléen indiquant si la colonne (c) est libre ou pas
		if(repre.grille[5][c] == 0) {return true;}
		return false;
	}
	
	public static void joueCoupRandom() {
		//joue un coup possible aléatoirement dans la grille
		boolean joue = false;
		int c = 0;
		while (joue != true){
			c = entierAleatoire(0,6);
			if(colonneEstLibre(c)) {
				joue = true;
			}
		}
		repre.jouer(2,  c, repre.grille);
	}
	
	public static void copieGrille(){
		//Effectue une copie de la Grille de jeu
		for(int i = 0; i < CopieGrille.length; i++) {
			for(int j = 0; j < CopieGrille[0].length; j ++) {
				CopieGrille[i][j] = repre.grille[i][j];
			}
		}

	}
	
	public static void reinitialiserCopieGrille(){
		copieGrille();
	}
	
	public static void peutGagner1Coup() {
		//joue le coup si il peu tgagner en 1 coup, joue aléatoirement sinon
		copieGrille();
	
		for(int j = 0; j < CopieGrille[0].length; j++) {
			repre.jouer(2, j, CopieGrille);
			if (verifWin.win(2, CopieGrille)) { 
				repre.jouer(2, j, repre.grille);
				return;
			}
		}
		joueCoupRandom();
		
	}
//Une amélioration possible est un stack de peutGagner1coup(modifié) effectué sur chaque colonne puis pour chaque action, réeffectuer peutGagner1coup afin d'obtenir une possibilité de gagner en 2 coup et ainsi de suite.
}
