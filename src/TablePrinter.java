public class TablePrinter {

    public void RowPrinter(int i, int[] D, int[] T) //prints the row with given all the values needed to be printed
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

    private void BoxPrinter(int N) { //prints a 9 space long box with a given integer
        if(N /10 ==0) System.out.print("    " + N + "    ");
        else if(N /10 <10)System.out.print("    " + N + "   ");
        else if(N /10 <100)System.out.print("   " + N + "   ");
        else if(N /10 <1000)System.out.print("   " + N + "  ");
        else if(N /10 <10000)System.out.print("  " + N + "  ");
        else if(N /10 <100000)System.out.print("  " + N + " ");
        else if(N /10 <1000000)System.out.print(" " + N + " ");
        else if(N /10 <10000000)System.out.print(" " + N + "");
        else if(N /10 <100000000)System.out.print("" + N + "");
        else System.exit(0);

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

    public void PrintFirstRow() // can be automized with using box printer with char values but we are only using string at the beginning
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
