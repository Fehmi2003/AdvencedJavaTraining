import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Player {
    private String name;
    private int balance;

    public Player(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void decreaseBalance(int amount) {
        balance -= amount;
    }

    public void increaseBalance(int amount) {
        balance += amount;
    }
}

class Card {
    private String rank;
    private String suit;
    private int value;

    public Card(String rank, String suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}

class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                int value = rank.equals("Ace") ? 11 : (rank.equals("Jack") || rank.equals("Queen") || rank.equals("King")) ? 10 : Integer.parseInt(rank);
                cards.add(new Card(rank, suit, value));
            }
        }
    }

    public Card drawCard() {
        int index = (int) (Math.random() * cards.size());
        return cards.remove(index);
    }
}

public class BlackjackGame {
    private Player player;
    private Player dealer;
    private Deck deck;

    public BlackjackGame(String playerName, int initialBalance) {
        player = new Player(playerName, initialBalance);
        dealer = new Player("Dealer", 0);
        deck = new Deck();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nBakiye: " + player.getBalance());
            System.out.print("Bahis yapın: ");
            int bet = scanner.nextInt();

            if (bet <= 0 || bet > player.getBalance()) {
                System.out.println("Geçersiz bahis miktarı.");
                continue;
            }

            List<Card> playerHand = new ArrayList<>();
            List<Card> dealerHand = new ArrayList<>();
            playerHand.add(deck.drawCard());
            playerHand.add(deck.drawCard());
            dealerHand.add(deck.drawCard());
            dealerHand.add(deck.drawCard());

            System.out.println("\nOyuncunun Kartları:");
            for (Card card : playerHand) {
                System.out.println(card);
            }
            System.out.println("\nDağıtıcının Açık Kartı: " + dealerHand.get(0));

            int playerScore = calculateHandValue(playerHand);
            if (playerScore == 21) {
                System.out.println("Blackjack! Kazandınız.");
                player.increaseBalance(bet * 2); // Blackjack ödülü 2 katıdır.
            } else {
                while (playerScore < 21) {
                    System.out.print("Başka bir kart çekilsin mi? (E/H): ");
                    String choice = scanner.next();
                    if (choice.equalsIgnoreCase("E")) {
                        Card drawnCard = deck.drawCard();
                        playerHand.add(drawnCard);
                        System.out.println("Çekilen Kart: " + drawnCard);
                        playerScore = calculateHandValue(playerHand);
                        System.out.println("Yeni El Değeri: " + playerScore);
                    } else if (choice.equalsIgnoreCase("H")) {
                        break;
                    }
                }

                int dealerScore = calculateHandValue(dealerHand);
                while (dealerScore < 17) {
                    Card drawnCard = deck.drawCard();
                    dealerHand.add(drawnCard);
                    dealerScore = calculateHandValue(dealerHand);
                }

                System.out.println("\nDağıtıcının Kartları:");
                for (Card card : dealerHand) {
                    System.out.println(card);
                }

                if (playerScore > 21) {
                    System.out.println("Oyuncu battı. Kaybettiniz.");
                    player.decreaseBalance(bet);
                } else if (dealerScore > 21 || playerScore > dealerScore) {
                    System.out.println("Kazandınız!");
                    player.increaseBalance(bet);
                } else if (playerScore == dealerScore) {
                    System.out.println("Berabere. Bahis iade ediliyor.");
                    player.increaseBalance(bet);
                } else {
                    System.out.println("Kaybettiniz.");
                    player.decreaseBalance(bet);
                }
            }

            System.out.print("Başka bir oyun oynansın mı? (E/H): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("E")) {
                break;
            }
        }
    }

    private int calculateHandValue(List<Card> hand) {
        int value = 0;
        int numAces = 0;

        for (Card card : hand) {
            value += card.getValue();
            if (card.getValue() == 11) {
                numAces++;
            }
        }

        while (value > 21 && numAces > 0) {
            value -= 10;
            numAces--;
        }

        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Oyuncunun adını girin: ");
        String playerName = scanner.nextLine();
        System.out.print("Başlangıç bakiyesini girin: ");
        int initialBalance = scanner.nextInt();

        BlackjackGame game = new BlackjackGame(playerName, initialBalance);
        game.play();
    }
}
