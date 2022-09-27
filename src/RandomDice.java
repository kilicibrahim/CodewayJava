import java.util.Random;
public class RandomDice {
    public int RandomDiceN()
    {
        Random rndGen = new Random();
        int N = rndGen.nextInt(6)+1;
        return N;
    }
}
