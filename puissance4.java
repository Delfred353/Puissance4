///----------------------------------------------------
// Auteurs : Pierre Roumane, Nicolas Merrer
// Game Version : 0.95
//----------------------------------------------------


package Puissance4;

import java.util.Scanner;

public class puissance4 {
	
	public static void main(String[] args) {
		System.out.println("Voulez-vous contre l'ia ? 1 pour oui et 0 pour non");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if( x == 1){
			LaunchPuissance4.jeuIA();	
		}
		else {
		LaunchPuissance4.jeu();}
		sc.close();
	}
	
	
}
