public class IA {
    private static int to_win = 4;

    public static boolean detect_win_condition(int player)
    {

        for (int i = 0; i < Puissance4.grille.length; i++)
            for (int j = 0; j < Puissance4.grille[i].length; j++)
                {
                    //check line/diag/column
                    if (Puissance4.grille[i][j] == player) {
                        if (check_line(Puissance4.grille[i], i, player) || check_column(Puissance4.grille, player) || check_diagonal(Puissance4.grille, i, j, player))
                            return (true);
                    }
                }
        return (false);
    }

    public static boolean check_line(int [] tab, int index, int player)
    { 
        for (int i = index; i <= to_win; i++)
            if (i >= tab.length || tab[i] != player)
                return (false);
        return (true);
    }

    public static boolean check_diagonal(int[][] tab, int i, int j, int player)
    {
        if (i >= (to_win) && j >= to_win)
            {
                //regarde bas a droite
            }
        else if (i <= (to_win) && j <= to_win)
            {
                //regarde en bas a gauche   
            }
        return (true);
    }

    public static boolean check_column(int[][] tab, int player)
    {
        //regarde en bas
        return (false);
    }
}
