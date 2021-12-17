package Puissance4;

import java.util.concurrent.ThreadLocalRandom;

public class IA{
	
	static int[][] CopieGrille = new int [6][7];
	static int joueur;
	
	public IA(int j) {
		joueur = j;
	}
	
	
	public static int entierAleatoire(int a, int b){
		//Retourne un entier aléatoire entre a (inclus) et b (inclus)
		return ThreadLocalRandom.current().nextInt(a, b + 1);	
	}
	
	public static boolean colonneEstLibre(int c) {
		if(repre.grille[6][c] == 0) {return true;}
		return false;
	}
	
	public static void joueCoupRandom() {
		boolean joue = false;
		int c = 0;
		while (joue != true){
			c = entierAleatoire(0,6);
			if(colonneEstLibre(c)) {
				joue = true;
			}
		}
		repre.jouer(joueur,  c, repre.grille);
	}
	
	public static void copieGrille(){
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
		copieGrille();
	
		for(int j = 0; j < CopieGrille[0].length; j++) {
			repre.jouer(joueur, j, CopieGrille);
			if (verifWin.win(joueur, CopieGrille)) { 
				repre.jouer(joueur, j, repre.grille);
				return;
			}
		}
		joueCoupRandom();
		
	}

}
