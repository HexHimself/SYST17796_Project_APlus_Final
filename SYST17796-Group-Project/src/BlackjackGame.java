
/**
 * class that models the game object
 *
 * @author Huixia Li
 */
public class BlackjackGame {

    private Player player;// the player of the game
    private Dealer dealer;

    public BlackjackGame(Player player, Dealer dealer) {
        this.player = player;
        this.dealer = dealer;
    }

    /**
     * @return the players of this game
     */
    public Player getPlayers() {
        return player;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(Player player) {
        this.player = player;
    }

    /**
     * Play the game.
     * 
     */
    public void play() {
        System.out.println("Hello, "+player.getName()+"! Welcome to BLACK JACK!!");
    };

    public void exit() {
        System.out.println("See you next time.");

    };

    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public void declareWinner(Object object) {
        System.out.println("Your hand: "+player.hand.showHandCards()+"Value: "+player.hand.getTotalValue());
        System.out.println("Dealer's hand: "+dealer.hand.showHandCards()+"Value: "+dealer.hand.getTotalValue());
        if (object instanceof Player)
            System.out.println(((Player) object).getName() + " wins!!");
        if (object instanceof Dealer)
            System.out.println("Dealer wins!!");
        if(object==null){
            System.out.println("The game ended in a tie.");
        }

    };

}// end class
