
/**
 * 
 *
 * @author Yunpeng Shan
 */
import java.util.Scanner;

public class Player {

    String name; //the unique name for this player
    Hand hand = new Hand();

    // constructor that accepts player name
    public Player(String name) {
        this.name = name;
    }

    // accessor for player name
    public String getName() {
        return name;
    }

    // mutator for player name
    public void setName(String name) {
        this.name = name;
    }
    
    // if returns true, player will draw a card
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
