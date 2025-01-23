/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



/*
Modified By : Amanpreet kaur
Student ID  : 991760822
*/
package cardgame;
import java.util.Random;

public class CardGame {
      
    private Card[] hand;
    private static final int HAND_SIZE = 7;
    private static final Card.Suit[] suits = Card.Suit.values();
    private static final Card.Value[] values= Card.Value.values();

    public CardGame() {
        hand = new Card[HAND_SIZE];
        generateHand();
    }

    private void generateHand() {
        Random random = new Random();
        
        for(int i=0; i<HAND_SIZE; i++)
        {
        Card.Suit randomSuit =suits[random.nextInt(suits.length)];
        Card.Value randomValue =values[random.nextInt(values.length)];
        
        hand[i] = new Card(randomValue,randomSuit);
        
        }
    }

    public void printHand() {
        for (Card card : hand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
    }
    
    public static void main(String[] args) {
        CardGame game = new CardGame();
        game.printHand();
    }
    
}
