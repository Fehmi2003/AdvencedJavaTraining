package gatesofBonanza;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class CasinoGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hoş geldiniz! Lütfen bir oyun seçin:");
        System.out.println("1. House Always Wins");
        System.out.println("2. Gates of Bonanza");

        int oyunSecimi = scanner.nextInt();

        if (oyunSecimi == 1) {
            houseAlwaysWinsGame(scanner);
        } else if (oyunSecimi == 2) {
            gatesOfBonanzaGame(scanner);
        } else {
            System.out.println("Geçersiz seçenek. Lütfen 1 veya 2 girin.");
        }
    }

    private static void houseAlwaysWinsGame(Scanner scanner) {
        System.out.println("House Always Wins Oyununa Hoş Geldiniz!");
        System.out.print("Kullanıcı Adınızı Girin: ");
        String username = scanner.next();

        double balance = 100.0; // Başlangıç bakiyesi
        ArrayList<String> gameHistory = new ArrayList<>();

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
        printGameHistory(gameHistory);
        System.out.println("Görüşmek üzere, " + username + "!");
    }

    private static void gatesOfBonanzaGame(Scanner scanner) {
        System.out.println("Gates of Bonanza Oyunu burada olacak. İlgili kodu ekleyin.");
    }

    private static int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    private static void printGameHistory(ArrayList<String> gameHistory) {
        System.out.println("\nOyun Geçmişi:");
        for (String result : gameHistory) {
            System.out.println(result);
        }
    }
}
