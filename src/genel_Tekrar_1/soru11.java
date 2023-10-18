package genel_Tekrar_1;

import java.util.Random;
import java.util.Scanner;

public class soru11 {
    /*
    * sıcak soğuk oyunu yapalım. sistem 100 e kadar bir sayı üretsin kullanıcı bu sayıyı tahmin etmeye çalışsın.
    *  kullanıcın girdiği değere göre kullanıcıyı arttır azalt diyerek uyaralım.
    *  kullanıcı sayıyı bulana kadar tahmin istemeye devam edelim ve sayıyıy bulduğunda kaç denemeden sonra bulduğunu belirtelim.
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maksimum = 100; // Rastgele seçilecek sayının maksimum değeri
        int sayi = random.nextInt(maksimum) + 1; // Rastgele sayıyı seç
        int tahmin, denemeSayisi = 0;

        System.out.println("Sıcak-Soğuk Tahmin Oyunu (1-" + maksimum + ")");

        do {
            System.out.print("Tahmininizi girin: ");
            tahmin = scanner.nextInt();
            denemeSayisi++;

            if (tahmin < 1 || tahmin > maksimum) {
                System.out.println("Geçersiz tahmin! 1 ile " + maksimum + "arasında bir sayı girin.");
            } else if (tahmin < sayi) {
                System.out.println("Soğuk. Daha büyük bir sayı deneyin.");
            } else if (tahmin > sayi) {
                System.out.println("Sıcak. Daha küçük bir sayı deneyin.");
            } else {
                System.out.println("Tebrikler! Sayıyı " + denemeSayisi + " denemede buldunuz.");
            }
        } while (tahmin != sayi);

        scanner.close();
    }
}
