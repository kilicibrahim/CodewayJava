public class TablePrinter {

    public void RowPrinter(int i, int[] D, int[] T)
    {
        LinePrinter();
        System.out.println();
        System.out.print("|");

        BoxPrinter(i);
        for(int j =0; j<3; j++)
        {
            BoxPrinter(D[j]);
        }
        for(int j =0; j<3; j++)
        {
            BoxPrinter(T[j]);
        }
    }

    private void BoxPrinter(int N) {
        if(N /10 ==0) System.out.print("    " + N + "    ");
        else System.out.print("    " + N + "   ");
        System.out.print("|");
    }

    public void LinePrinter()
    {
        System.out.println();
        System.out.print("+");
        for(int j =0; j<7; j++)
        {
            System.out.print("---------+");
        }
    }

    public void PrintFirstRow()
    {
        LinePrinter();
        System.out.println();
        System.out.print("|");

        System.out.print("  " + "ROUND" + "  ");
        System.out.print("|");

        System.out.print("  " + "DICE1" + "  ");
        System.out.print("|");

        System.out.print("  " + "DICE2" + "  ");
        System.out.print("|");

        System.out.print("  " + "DICE3" + "  ");
        System.out.print("|");

        System.out.print("  " + "TOTAL1" + " ");
        System.out.print("|");

        System.out.print("  " + "TOTAL2" + " ");
        System.out.print("|");

        System.out.print("  " + "TOTAL3" + " ");
        System.out.print("|");
    }
}
