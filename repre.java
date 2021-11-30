package puissance4;

public class repre{
	//Exercice 1
	public static int[][] grille = new int[6][7];
	
	public static void initialiseGrille() {
		grille = new int[6][7];
	}
	//Exercice 1
	
	//Exercice 2
	public static void jouer(int joueur, int colonne) {//1<=joueur<=2
		//Place un jeton dans la colonne indiqué dans un emplacement libre, en partant du haut de la colonne
		for(int i = 0; i < grille.length; i ++) {
			if(grille[i][colonne] == 0) { //Test rajouter comme sécurité, 0 est une case vide
				grille[i][colonne] = joueur;
				return;
			}
			else{System.out.println("Colonne pleine, votre tour a été passé");}//Si la colonne est pleine, le coup du joeur n'est pas compatibilisé
		}
	}
	//Exercice 2
	
}