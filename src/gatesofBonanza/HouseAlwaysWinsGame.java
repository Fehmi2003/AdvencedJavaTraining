package gatesofBonanza;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class HouseAlwaysWinsGame {
    private static double balance = 100.0; // Başlangıç bakiyesi
    private static ArrayList<String> gameHistory = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("House Always Wins Oyununa Hoş Geldiniz!");
        System.out.print("Kullanıcı Adınızı Girin: ");
        String username = scanner.nextLine();

        while (balance > 0) {
            System.out.println("\nBakiye: $" + balance);
            System.out.print("Bahis Miktarınızı Girin (Çıkış için 0 girin): ");
            double betAmount = scanner.nextDouble();

            if (betAmount == 0) {
                break;
            }

            if (betAmount > balance) {
                System.out.println("Yetersiz bakiye. Lütfen geçerli bir miktar girin.");
                continue;
            }

            // Zar atma işlemi
            int userDice = rollDice();
            int houseDice = rollDice();

            System.out.println("Siz: " + userDice);
            System.out.println("Ev: " + houseDice);

            if (userDice > houseDice) {
                balance += betAmount;
                System.out.println("Kazandınız! +$" + betAmount);
            } else {
                balance -= betAmount;
                System.out.println("Kaybettiniz. -$" + betAmount);
            }

            String result = "Sonuç: Siz(" + userDice + ") - Ev(" + houseDice + ")";
            gameHistory.add(result);
        }

        System.out.println("Oyun Bitti. Toplam Bakiye: $" + balance);
        printGameHistory();
        System.out.println("Görüşmek üzere, " + username + "!");
    }

    // Zar atma işlemi
    private static int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    // Oyun geçmişini görüntüleme
    private static void printGameHistory() {
        System.out.println("\nOyun Geçmişi:");
        for (String result : gameHistory) {
            System.out.println(result);
        }
    }
}
