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
	public static int[][] symetrieHorizontale(int[][] tab){
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
	//FOCTION TEST
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
	public static void afficheGrille() {
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
