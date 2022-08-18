import java.util.Scanner;

/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */


/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Player {

    String name; //the unique name for this player
    Hand hand = new Hand();

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public boolean drawACardOrNot() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to draw one more card?(Y/N)");
            String drawcard = sc.next();
            if (drawcard.equalsIgnoreCase("Y")) {
                return true;
            } else if (drawcard.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Please enter valid answer!");
            }
        }
    }
}
