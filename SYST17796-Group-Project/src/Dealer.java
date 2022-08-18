/**
 *
 * @author Yunpeng Shan
 */
public class Dealer  {
    
    Hand hand = new Hand();
    // default constructor
    public Dealer() {
      
    }
    // returns 'true' if dealer's hand has a value of over 16
    public boolean isOverSixteen(){
        return hand.getTotalValue()>16;

    }

}
