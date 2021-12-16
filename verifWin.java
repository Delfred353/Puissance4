
public class verifWin{
	
	  public static boolean win(int player)
	    {

	        for (int i = 0; i < repre.grille.length; i++)
	            for (int j = 0; j < repre.grille[i].length; j++)
	                {
	                    //check line/diag/column
	                    if (repre.grille[i][j] == player) {
	                        if (checkLine( i, player) || checkColumn(j, player) || checkDiag(j, player))
	                            return (true);
	                    }
	                }
	        return (false);
	    }

	  

	   

	    public static boolean checkColumn(int j, int jouant) {
	    	int k = 0;
	    	for(int i = 0; i < repre.grille.length; i++) {
	    		if(repre.grille[i][j] == jouant) {
	    			k+=1; 
	    			if(k==4) {return true;}
	    		}
	    		else {k=0;}
	    		
	    	}
	    	return false;
	    }
	    
	   //NE PAS TOUCHER 
	    public static boolean grilleEstPleine() {
			//Détecte si la dernière ligne du tableau(donc le haut des colonnes) est plein, si c'est le cas return true sinon false
			for(int j = 0; j < repre.grille[5].length ; j ++) {
				if(repre.grille[5][j] == 0) {return false;}
			}
			return true;
		}
	    //NE PAS TOUCHER
	    
	    public static boolean checkLine(int i, int jouant) {
	    	int k = 0;
	    	for(int j = 0; j < repre.grille[i].length; j ++) {
	    		if(repre.grille[i][j] == jouant) {k+=1;}
	    		else {k = 0;}
	    	}
	    	if(k == 4) {return true;}
	    	return false;
	    }
	    
	    public static boolean checkDiag(int i, int jouant) {
	    	int j = i;
	    	int k = 0;
	    	if(j < repre.grille[0].length) {
		    	for(int x = 0; x < repre.grille.length; x++) {
		    		if(repre.grille[x][j] == jouant) {k +=1;
		    		
		    		if(k == 4) {return true;}}
		    		else {k=0;
		    			
		    		}
		    		if(j+1 < repre.grille[x].length) {j+=1;}
		    		
		    	}
		    	j = i;
		    
	    	}
	    	
	    	
	    	
	    	if(i-1 != 0) {
	    	
	    		for(int x = 0; x < repre.grille.length; x++) {
		    		if(repre.grille[x][j] == jouant) {k +=1;if(k ==4) {return true;}}
		    		else {k=0;}
		    		if(j-1 >= 0) {j-=1;}
		    		else {return false;}
		    	}
		    	
	    	}
	    	
	    	return false;
	  
	    }
	    
	    
	    public static void main(String[] args) {
	    	System.out.println(checkLine(1, 1));
	    	repre.jouer(1, 3, repre.grille);
	    	repre.jouer(1, 3, repre.grille);
	    	repre.jouer(1, 3, repre.grille);
	    	repre.jouer(1, 3, repre.grille);
	    	repre.jouer(1, 4, repre.grille);
	    	repre.jouer(1, 4, repre.grille);
	    	repre.jouer(1, 4, repre.grille);
	    	repre.jouer(1, 4, repre.grille);
	    	repre.jouer(1, 5, repre.grille);
	    	repre.jouer(1, 5, repre.grille);
	    	repre.jouer(1, 5, repre.grille);
	    	repre.jouer(1, 5, repre.grille);
	    	repre.jouer(1, 6, repre.grille);
	    	
	    
	    	System.out.println(checkLine(0, 1));
	    	Display.afficheGrille();
	    	System.out.println(checkDiag(6, 1));
	    	System.out.println(win(1));
	    }
	    
	    
	    
	    
	    
	    
}
