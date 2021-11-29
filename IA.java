import java.security.PKCS12Attribute;



public class IA {
    private static int P1 = 1;
    private static int P2 = 2;
    private static int to_win = 4;

    public static boolean detect_win_condition(int player)
    {

        for (int i = 0; i < Puissance4.grille.length; i++)
            for (int j = 0; j < Puissance4.grille[i].length; j++)
                {
                    //check line/diag/column
                    if (Puissance4.grille[i][j] == player) {
                        if (check_line(Puissance4.grille[i], P1) || check_column(Puissance4.grille, P1) || check_diagonal(Puissance4.grille, j))
                            return (true);
                    }
                }
        return (false);
    }

    public static boolean check_line(int [] tab, int player)
    { 
        for (int i = 0; i < tab.length; i++)
            if (tab[i] == player)
                return (true);
        return (false);
    }

    public static boolean check_diagonal(int[][] tab, int player)
    {
        return (false);
    }

    public static boolean check_column(int[][] tab, int player)
    {
        return (false);
    }
}
