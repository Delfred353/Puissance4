import java.security.PKCS12Attribute;



public class IA {
    private static int P1 = 1;
    private static int P2 = 2;
    private static int to_win = 4;

    public static int detect_win_condition(int [][] tab)
    {
        for (int i = 0; i < tab.length; i++)
            for (int j = 0; j < tab[i].length; j++)
                {
                    if (tab[i][j] == P1) {
                        if (check_line(tab[i], P1) || check_column(tab, P1) || check_diagonal(tab))
                            return (P1);

                    }
                    if (tab[i][j] == P2) {
                        if (check_line(tab[i], P2) || check_column(tab, P2) || check_diagonal(tab, P2))
                            return (P2);
                    }

                }
    }

    public static boolean check_line(int [] tab, int player)
    { 
        for (int i = 0; i < tab.length; i++)
            if (tab[i] == player)
                return (true);
        return (false);
    }
}
