import java.util.Random;

public class CardGame {

    public static void main(String[] args) {
        int numOfCards = 5;  
        int numOfPlayers = 4; 

        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] playersCards = distributeCards(deck, numOfCards, numOfPlayers);
        printPlayersCards(playersCards);
    }

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
		
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();

        for (int i = 0; i < deck.length; i++) {
            int randomCardIndex = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomCardIndex];
            deck[randomCardIndex] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfCards * numOfPlayers > deck.length) {
            System.out.println("Not enough cards to distribute to players.");
            return null;
        }

        String[][] players = new String[numOfPlayers][numOfCards];
        int cardIndex = 0;

        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCards; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    public static void printPlayersCards(String[][] playersCards) {
        if (playersCards == null) return;

        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < playersCards[i].length; j++) {
                System.out.print(playersCards[i][j] + " ");
            }
            System.out.println();
        }
    }
}
