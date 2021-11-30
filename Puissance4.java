///----------------------------------------------------
// Auteurs : Pierre Roumane, Nicolas Merrer
// Version : 0.7
//----------------------------------------------------
package Puissance4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Puissance4 {
	
	public static int entierAleatoire(int a, int b){
		//Retourne un entier aléatoire entre a (inclus) et b (inclus)
		return ThreadLocalRandom.current().nextInt(a, b + 1);	
	}

	

	
	public static boolean grilleEstPleine() {
		//Détecte si la dernière ligne du tableau(donc le haut des colonnes) est plein, si c'est le cas return true sinon false
		for(int j = 0; j < repre.grille[5].length ; j ++) {
			if(repre.grille[5][j] == 0) {return false;}
		}
		return true;
	}

	
	public static void boucleDeJeu() {
		
		int victoire = 0;
		int grillePleine = 0;
		int jouant = 1;
		Scanner sc = new Scanner(System.in);
		while(victoire == 0 || grillePleine != 0) {
			Display.afficheGrille();
			System.out.println("Quel coup pour le joueur " + jouant);
			int c = sc.nextInt();
			repre.jouer(jouant, c);
			
			if(IA.detect_win_condition(jouant)) {victoire = jouant;}
			else if(grilleEstPleine()) {grillePleine = 1;}
			else {
				if(jouant == 1) {jouant = 2;}
				else {jouant = 1;}
			}
			
	
		}
		sc.close();
	}

	public static void jeu() {
		//Lance le jeu
		repre.initialiseGrille();
		boucleDeJeu();
		Display.afficheGrille();
	}
	
	public static void main(String[] args) {

	}
	
}