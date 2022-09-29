import java.util.Random;
public class RandomDice {
    public int RandomDiceN() // Gives a number between 1-6
    {
        Random rndGen = new Random();
        return rndGen.nextInt(6)+1;
    }
}
