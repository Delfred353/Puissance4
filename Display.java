package Puissance4;

public class Display{
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
		int[][] tab = symetrieHorizontale(repre.grille);
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
		repre.initialiseGrille();
		repre.jouer(1, 6, repre.grille);
		repre.jouer(2,  4, repre.grille);
		repre.jouer(2, 6, repre.grille);
		repre.jouer(1,  4, repre.grille);
		afficheGrille();
		int[][] tab = new int[6][7];
		for(int i = 0; i < tab.length; i ++) {
			for(int j = 0; j < tab[i].length; j ++) {
				tab[i][j] = i;
			}
		}
		
		repre.afficheTab2D(tab);
		repre.afficheTab2D(symetrieHorizontale(tab));
	}
	
	
}
