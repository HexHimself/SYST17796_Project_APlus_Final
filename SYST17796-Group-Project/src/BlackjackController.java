import java.util.Scanner;
/**
 * main method that plays the game
 * 
 * @author Huixia Li
 */

public class BlackjackController {

    public static void main(String[] args) {
        // recieves player name with scanner
        System.out.println("Please Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Player player = new Player(name);
        Dealer dealer = new Dealer();
        // creates new blackjack game
        BlackjackGame newGame = new BlackjackGame(player, dealer);
        newGame.play();
        player.hand.drawCards(2);
        dealer.hand.drawCards(2);
        // shows player's hand after drawing cards
        System.out.print("Your cards: "+player.hand.showHandCards());
        System.out.print("\nDealer's second card: ");
        dealer.hand.showIndexCards(1);
        int drawCardOrder = 1;
        // asks player if they would like to draw a card or not
        while (player.drawACardOrNot()) {
            player.hand.drawCards(1);
            dealer.hand.drawCards(1);
            drawCardOrder++;
            System.out.println("Your cards: "+player.hand.showHandCards());
            // if the player's hand exceeds 21, the player loses
            if (player.hand.exceeded21()) {
                newGame.declareWinner(dealer);
                return;
            }
        }
        // if dealer's hand is not over 16, they will draw another card
        if (!dealer.isOverSixteen()) {
            dealer.hand.drawCards(1);
            drawCardOrder++;
            dealer.hand.showIndexCards(drawCardOrder);
        }
        // if dealer's hand exceeds 21, grants win to the player
        if (dealer.hand.exceeded21()) {
            newGame.declareWinner(player);
        } else {
            compareValue(player, dealer, newGame);
        }
        newGame.exit();
    }
    // compares the value of the player and dealer's hands
    private static void compareValue(Player player, Dealer dealer, BlackjackGame newGame) {
        System.out.println("Your hand: "+player.hand.showHandCards()+"Value: "+player.hand.getTotalValue());
        System.out.println("Dealer's hand: "+dealer.hand.showHandCards()+"Value: "+dealer.hand.getTotalValue());
        if (player.hand.getTotalValue() > dealer.hand.getTotalValue()) {
            newGame.declareWinner(player);
        } else if (player.hand.getTotalValue() == dealer.hand.getTotalValue()) {
            newGame.declareWinner(null);
        } else {
            newGame.declareWinner(dealer);
        }
    }

}
