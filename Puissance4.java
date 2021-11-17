//----------------------------------------------------
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
		for(int i = 0; i < grille.length; i ++) {
			if(grille[i][colonne] == 0) {
				grille[i][colonne] = joueur;
				return;
			}
		}
	}
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
	public static void main(String[] args) {
		jouer(1, 3);
		afficheTab2D(grille);
	}
}
