/**
 * @author Marshall Christie
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public enum Value {

    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;
     
    // creates an arraylist of suit enums
    private static final ArrayList<Value> VALUES = 
        new ArrayList<Value>(Arrays.asList(Value.values()));
    // assigns arraylist size to an int variable
    private static final int SIZE = VALUES.size();
    // instantiates an new random object
    private static final Random RANDOM = new Random();
    
    // generates a random value from the aformentioned arraylist
    public static Value randomValue() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

}
