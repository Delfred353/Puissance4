package Puissance4;

public class repre{
	//Exercice 1
	public static int[][] grille = new int[6][7];
	
	public static void initialiseGrille() {
		grille = new int[6][7];
	}
	//Exercice 1
	
	//Exercice 2
	public static void jouer(int joueur, int colonne, int [][] tab) {//1<=joueur<=2
		//Place un jeton dans la colonne indiqué dans un emplacement libre, en partant du haut de la colonne
		for(int i = 0; i < tab.length; i ++) {
			if(tab[i][colonne] == 0) {
				tab[i][colonne] = joueur;
				return;
			}
		}
	}
	//Exercice 2
	
	//tests
	
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
		jouer(1, 3, grille);
		jouer(1, 3, grille);
		jouer(1, 3, grille);
		jouer(1, 3, grille);
		jouer(1, 3, grille);
		jouer(1, 3, grille);
		jouer(2, 4, grille);
		afficheTab2D(grille);
	}
	//tests
}
