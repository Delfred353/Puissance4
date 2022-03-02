package Puissance4;

import java.util.Scanner;


///----------------------------------------------------
//Auteurs : Pierre Roumane, Nicolas Merrer
//File Version : 0.9
//-----------------------------------------------------

public class LaunchPuissance4{

	public static void boucleDeJeu() {
		
		int victoire = 0;
		int grillePleine = 0;
		int jouant = 1;
		Scanner sc = new Scanner(System.in);//Ouvre une lecture de l'entrée standard pour les coups des joueurs.
		
		while(victoire == 0 && grillePleine == 0) {
			Display.afficheGrille();
			System.out.println("Quel coup pour le joueur " + jouant);
			int c = sc.nextInt();
			repre.jouer(jouant, c, repre.grille);
			
			if(verifWin.win(jouant, repre.grille)) {victoire = jouant;}
			else if(verifWin.grilleEstPleine()) {grillePleine = 1;}
			else {
				if(jouant == 1) {jouant = 2;}
				else {jouant = 1;}
			}

		}
		sc.close();
		if(victoire == 1) {System.out.println("Victoire du joueur 1");}
		else if(victoire == 2) {System.out.println("Victoire du joueur 2");}
		else if(grillePleine == 1) {System.out.println("Égalité des deux joueurs ( la grille est pleine)");}
	}

	public static void jeu() {
		//Lance le jeu
		repre.initialiseGrille();
		boucleDeJeu();
		Display.afficheGrille();
	}
	
	public static void boucleDeJeuIA() {
		
		int victoire = 0;
		int grillePleine = 0;
		int jouant = 1;
		Scanner sc = new Scanner(System.in);//Ouvre une lecture de l'entrée standard pour les coups des joueurs.
		
		while(victoire == 0 && grillePleine == 0) {
			
			System.out.println("_______________");
			Display.afficheGrille();
			if(jouant == 1) {
			System.out.println("Quel coup voulez vous jouer ?");
			int c = sc.nextInt();
			repre.jouer(1, c, repre.grille);
			}
			else {
				IA.peutGagner1Coup();
			}

			if(verifWin.win(jouant, repre.grille)) {victoire = jouant;}
			else if(verifWin.grilleEstPleine()) {grillePleine = 1;}
			else {
				if(jouant == 1) {jouant = 2;}
				else {jouant = 1;}
			}

		}
		sc.close();
		if(victoire == 1) {System.out.println("Victoire du joueur 1");}
		else if(victoire == 2) {System.out.println("Victoire du joueur 2");}
		else if(grillePleine == 1) {System.out.println("Égalité des deux joueurs ( la grille est pleine)");}
	}
	
	public static void jeuIA() {
		repre.initialiseGrille();
		boucleDeJeuIA();
		Display.afficheGrille();
	}
}
