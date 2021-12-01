package Puissance4;

import java.util.Scanner;


///----------------------------------------------------
//Auteurs : Pierre Roumane, Nicolas Merrer
//Version : 0.6
//-----------------------------------------------------

class LaunchPuissance4{

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
			
			if(verifWin.detect_win_condition(jouant)) {victoire = jouant;}
			else if(verifWin.grilleEstPleine()) {grillePleine = 1;}
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
}