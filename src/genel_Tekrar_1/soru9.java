package genel_Tekrar_1;

import java.util.Scanner;

public class soru9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Notunuzu girin (0-100): ");
        int not = scanner.nextInt();
        scanner.close();

        char harfNot;

        if (not < 0 || not > 100) {
            System.out.println("Geçersiz not girdiniz.");
            return;
        }

        int notSiniri = not / 10; // Notu 10'a bölelim.

        switch (notSiniri) {
            case 10:
            case 9:
                harfNot = 'A';
                break;
            case 8:
                harfNot = 'B';
                break;
            case 7:
                harfNot = 'C';
                break;
            case 6:
                harfNot = 'D';
                break;
            default:
                harfNot = 'F';
                break;
        }

        System.out.println("Harf notunuz: " + harfNot);
    }
}
