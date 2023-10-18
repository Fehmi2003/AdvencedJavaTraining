package genel_Tekrar_1;

import java.util.Scanner;

public class soru12 {
    //Kullanıcıdan sürekli olarak sayı alan ve de kullanıcı 0a bastığında girdiği sayıların
    //çarpımını sonuç olarak gösteren programı yazınız.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carpim = 1; // Çarpımı başlangıçta 1 olarak ayarlayın.

        System.out.println("Çarpım hesaplamak için sayıları girin (0'a basarak hesaplamayı sonlandırın):");

        while (true) {
            int sayi = scanner.nextInt();

            if (sayi == 0) {
                break; // Kullanıcı 0'a bastığında döngüden çık.
            }

            carpim *= sayi; // Sayıyı çarpıma ekleyin.
        }

        System.out.println("Girdiğiniz sayıların çarpımı: " + carpim);

        scanner.close();
    }
}
