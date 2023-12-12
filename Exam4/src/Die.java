import java.util.concurrent.ThreadLocalRandom;
public class Die {

    private int numSides;

    private int value;


    public Die(){
        this.numSides = 6;
        this.value = 1;
    }
    public Die(int numSides){
        this.numSides = numSides;
        this.value = 1;

    }

    @Override
    public String toString(){
        return "Number of on dice is" + this.numSides +
                " The value of the roll is" + this.value;

    }

    public static void rolls(int numSides, int value){
        value = ThreadLocalRandom.current().nextInt(1, numSides);

    }

    public int getNumSides(){
        return numSides;
    }

    public void  setNumSides(int sides){
        this.numSides = sides;

    }

    public int getValue(){
        return value;
    }

    public void  setValue(int value){
        this.value = value;

    }
}

