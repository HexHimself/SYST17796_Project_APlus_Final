/**
 * @author Marshall Christie
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public enum Suit {
    
    DIAMONDS,
    CLUBS,
    HEARTS,
    SPADES;
    
    // creates an arraylist of suit enums
    private static final ArrayList<Suit> SUITS = 
        new ArrayList<Suit>(Arrays.asList(Suit.values()));
    // assigns arraylist size to an int variable
    private static final int SIZE = SUITS.size();
    // instantiates a new random object
    private static final Random RANDOM = new Random();
    
    // generates a random suit from the aformentioned arraylist
    public static Suit randomSuit() {
        return SUITS.get(RANDOM.nextInt(SIZE));
    }
}
