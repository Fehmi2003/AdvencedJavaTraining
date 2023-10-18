package genel_Tekrar_1;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyeli hesaplanacak sayıyı girin: ");
        int sayi = scanner.nextInt();
        scanner.close();

        long faktoriyel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }

        System.out.println(sayi + "! = " + faktoriyel);
    }
}
