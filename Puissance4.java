///----------------------------------------------------
// Auteurs : Pierre Roumane, Nicolas Merrer
// Version : 0.1 
//----------------------------------------------------
package puissance4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class projet {
	public static int[][] grille = new int[6][7];
	
	public static int entierAleatoire(int a, int b){
		//Retourne un entier aléatoire entre a (inclus) et b (inclus)
		return ThreadLocalRandom.current().nextInt(a, b + 1);	
	}
	
	public static void jouer(int joueur, int colonne) {
		//Place un jeton dans la colonne indiqué dans un emplacement libre, en partant du haut de la colonne
		for(int i = 0; i < grille.length; i ++) {
			if(grille[i][colonne] == 0) {
				grille[i][colonne] = joueur;
				return;
			}
		}
	}
	
	public static int[][] symetrieHorizontale(int[][] tab){
		//Renverse l'organisation du tableau pour préparé son affichage
		int n = tab.length;
		int[][] rep = new int[n][];
		
		for(int i =0; i < n; i ++) {
			rep[i] = new int[tab[i].length];
			for(int j = 0; j < tab[i].length; j ++) {
				rep[i][j] = 0;
			}
		}
		for(int i = 0; i < n; i ++) {
		
			for(int j = 0; j < tab[i].length; j ++) {

				if(n%2 == 0) {
					if(i <= n /2) {rep[(n-1) - i][j] = tab[i][j];}
					else {
						if(i != tab.length-1){rep[i - n/2][j] = tab[i][j];}
						else {rep[0][j] = tab[i][j];}
					}
				}
				else {
					if(i != n/2) {
						if(i <= n /2) {rep[(n-1) - i] [j] = tab[i][j];}
						else {rep[i - n/2-1][j] = tab[i][j];}
					}
					else {rep[i][j] = tab[i][j];}
				}
			}
		}
		return rep;
	}

	public static void afficheGrille() {
		//Affiche la grille de jeu avec X pour les jetons du joueur 1 et O pour ceux du joueur 2
		String rep = "";
		int[][] tab = symetrieHorizontale(grille);
		for(int i = 0; i < tab.length; i++) {
			rep+="|";
			for(int j = 0; j < tab[i].length; j ++) {
				if(tab[i][j] == 0) {rep+=" |";}
				else if(tab[i][j] == 1) {rep+="X|";}
				else if(tab[i][j] == 2) {rep+="O|";}
			}
			rep+="\n";
		}
		System.out.print(rep);
	}
	
	
	//FONCTION TEST
	public static void afficheTab2D(int [][] tab) {
		String rep = "{";
		for(int i =0; i < tab.length; i ++) {
			rep += "{";
			for(int j = 0; j < tab[i].length-1; j ++) {
				rep += tab[i][j]+ ", ";
			}
			rep += tab[i][tab[i].length-1] + "},\n";
		}
		System.out.println(rep +"}");
	}
	//FONCTION TEST
	
	
	public static boolean grilleEstPleine() {
		//Détecte si la dernière ligne du tableau(donc le haut des colonnes) est plein, si c'est le cas return true sinon false
		for(int j = 0; j < grille[5].length ; j ++) {
			if(grille[5][j] == 0) {return false;}
		}
		return true;
	}
	
	
	public static void resetGrille() {
		//Remets la grille de jeu dans son état d'origine
		grille = new int[6][7];
	}
	
	public static void boucleDeJeu() {
		
		int victoire = 0;
		int grillePleine = 0;
		int jouant = 1;
		Scanner sc = new Scanner(System.in);
		while(victoire == 0 || grillePleine != 0) {
			afficheGrille();
			System.out.println("Quel coup pour le joueur " + jouant);
			int c = sc.nextInt();
			jouer(jouant, c);
			
			if(detect_win_condition(jouant)) {victoire = jouant;}
			else if(grilleEstPleine()) {grillePleine = 1;}
			else {
				if(jouant == 1) {jouant = 2;}
				else {jouant = 1;}
			}
			
	
		}
	}
	
	public static void jeu() {
		//Lance le jeu
		resetGrille();
		boucleDeJeu();
		afficheGrille();
	}
	
	public static void main(String[] args) {
		jouer(1, 3);
		jouer(1, 3);
		jouer(1, 3);
		jouer(1, 3);
		jouer(1, 3);
		jouer(1, 3);
		jouer(2,4);
		afficheTab2D(grille);
		afficheTab2D(symetrieHorizontale(grille));
		afficheGrille();
	}
	
}
