//----------------------------------------------------
// Auteurs : Pierre Roumane, Nicolas Merrer
// Version : 0.1 
//----------------------------------------------------
package puissance4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class projet {
	public static int entierAleatoire(int a, int b){
		//Retourne un entier aléatoire entre a (inclus) et b (inclus)
		return ThreadLocalRandom.current().nextInt(a, b + 1);	
	}

	public static void main(String[] args) {
		int[][] grille = new int[6][7];
	}
}
