package Puissance4;

public class IA {
    private static int to_win = 4;

    public static boolean detect_win_condition(int player)
    {

        for (int i = 0; i < repre.grille.length; i++)
            for (int j = 0; j < repre.grille[i].length; j++)
                {
                    //check line/diag/column
                    if (repre.grille[i][j] == player) {
                        if (check_line(repre.grille[i], i, player) || check_column(repre.grille, player) || check_diagonal(repre.grille, i, j, player))
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
        int cpyi = i, cpyj = j;

        if (i >= to_win && j >= to_win)
            {
                //regarde bas a droite
                while (cpyi < to_win && tab[cpyi][cpyj] == player)
                    {
                        cpyi++;
                        cpyj++;
                    }
                if (tab[cpyi][cpyj] != player)
                    return (false);
            }
        else if (i <= to_win && j <= to_win)
            {
                //regarde en bas a gauche
                while (cpyi < to_win && tab[cpyi][cpyj] == player)
                {
                    cpyi--;
                    cpyj--;
                }
                if (tab[cpyi][cpyj] != player)
                    return (false);   
            }
        return (true);
    }

    public static boolean check_column(int[][] tab, int player)
    {
        //regarde en bas
        return (false);
    }
}