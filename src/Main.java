import java.util.*;

public class Main {
    public static void main(String[] args) {

        RandomDice rD = new RandomDice();
        TablePrinter tP = new TablePrinter();
        DiceManager dM = new DiceManager();

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number Of Rounds: ");
        int NumberOfRounds = sc.nextInt();

        tP.PrintFirstRow();
        int Total1 =0;
        int Total2 =0;
        int Total3 =0;
        for(int i=1; i<=NumberOfRounds; i++)
        {
            int Dice1 =  rD.RandomDiceN();
            int Dice2 =  rD.RandomDiceN();
            int Dice3 =  rD.RandomDiceN();

            int[] diceTemp = {Dice1, Dice2, Dice3};

            int[] temp = dM.compareDices(Dice1, Dice2, Dice3);

            Total1 += temp[0];
            Total2 += temp[1];
            Total3 += temp[2];

            int[] totalTemp = {Total1, Total2, Total3};
            tP.RowPrinter(i, diceTemp, totalTemp);

        }
        tP.LinePrinter();
    }

}