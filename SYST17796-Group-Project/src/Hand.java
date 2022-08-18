/**
 *
 * @author Fenfen Gong
 */
import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;
    
    // default constructor
    public Hand() {
        cards = new ArrayList<Card>();
    }
    
    // constructor that passes arraylist into cards
    public Hand (ArrayList<Card> cards) {
        this.cards = cards;
    }
    
    // accessor for cards
    public ArrayList<Card> getCards() {
        return cards;
    }
    
    // shows all cards in hand
    public String showHandCards() {
        if (cards.isEmpty()) {
            return "there is no cards in hand";
        }
        String allCard="";
        for (Card card : cards) {
            allCard += (card + " ");
        }
        return allCard;
    }
    
    // prints the index of a card in the hand
    public void showIndexCards(int index) {

        if (index < 0 || index > cards.size()) {
            System.out.println("invalid index to show card");
            return;
        }
        System.out.println(cards.get(index));

    }
    
    // returns true if the total value of the hand is greater than 21
    public boolean exceeded21() {
        int sum = 0;
        int numOfAce = countNumOfAce();
        for (Card card : cards) {
            sum += card.getNumValue();
        }
        return ((sum - numOfAce * 10) > 21);
    }
    
    // accessor retieves total hand value
    public int getTotalValue() {
        int totalValue = 0;
        if(countNumOfAce() == 0) {
            for (Card card : cards) {
                totalValue += card.getNumValue();
            }
            return totalValue;
        } else {
            int numOfAce = countNumOfAce();
            for (Card card : cards) {
                totalValue += card.getNumValue();
            }
            while (numOfAce != 0 && totalValue > 21){
                totalValue = totalValue - 10;
                numOfAce--;
            } 
            return totalValue;
        }
    }
    
    // adds cards to the hand depending on the number passed in
    public void drawCards(int num) {
        for (int i = 0; i < num; i++) {
            Card card = new Card(Value.randomValue(),Suit.randomSuit());
            cards.add(card);
        }
    }
    
    // returns the number of aces in the hand
    public int countNumOfAce() {
        int numOfAce = 0;
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getNumValue() == 11) {
                numOfAce++;
            }
        }
        return numOfAce;
    }
    
    // toString for displaying hand information
    @Override
    public String toString() {
        return String.valueOf(cards);
    }
}
