public class DiceManager {
    public int[] compareDices(int d1, int d2, int d3)
    {
        int[] dices = null;
        if(d1 == d2 && d2 == d3)
        {
            dices = addEach(d1, d2, d3);
        }
        else if(d1 == d2)
        {
            if(d1 > d3)
                dices = addWithBonus(d1, d2, d3, 0);
            else dices = addEach(d1, d2, d3);
        }
        else if(d2 == d3)
        {
            if(d2 > d1)
                dices = addWithBonus(d1, d2, d3, 1);
            else dices = addEach(d1, d2, d3);
        }
        else if(d1 == d3)
        {
            if(d1 > d2)
                dices = addWithBonus(d1, d2, d3, 2);
            else dices = addEach(d1, d2, d3);
        }
        else
        {
            dices = addEach(d1, d2,d3);
        }

        return dices;
    }

    private int[] addEach(int d1, int d2, int d3)
    {
        int[] T = {d1, d2, d3};

        return T;
    }

    private int[] addWithBonus(int d1, int d2, int d3, int Senario)
    {
        int[] T = {d1, d2, d3};
        switch(Senario) {
            case 0:
                T[0] = T[0]*2;
                T[1] = T[1]*2;
                break;
            case 1:
                T[1] = T[1]*2;
                T[2] = T[2]*2;
                break;
            case 2:
                T[0] = T[0]*2;
                T[2] = T[2]*2;
                break;
        }
        return T;
    }
}
