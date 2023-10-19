package gatesofBonanza;

import java.util.Random;
import java.util.Scanner;

public class demoVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı giriniz :");
        String kullaniciAdi = scanner.nextLine();

        int bakiye = 500;
        boolean devam = true;
        int toplamKazanc = 0;
        int toplamKayip = 0;

        while (devam) {
            if (bakiye < 500) {
                System.out.println("Yetersiz bakiye. Oyunu oynamak için yeterli kredi yok. ");
                break;
            }

            int sansliSayi = (int) (Math.random() * 99 + 1);
            System.out.println("Bakiye: " + bakiye + " TL");
            System.out.println("Lütfen tahmininizi giriniz: ");

            int tahminEdilenSayi = scanner.nextInt();

            int sansliSayiBirinciBasamak = sansliSayi / 10;
            int sansliSayiIkinciBasamak = sansliSayi % 10;
            int tahminEdilenSayiBirinciBasamak = tahminEdilenSayi / 10;
            int tahminEdilenSayiIkinciBasamak = tahminEdilenSayi % 10;

            int kazanc = 0;

            if (sansliSayi == tahminEdilenSayi) {
                kazanc = 10000;
            } else if (sansliSayiBirinciBasamak == tahminEdilenSayiIkinciBasamak
                    && sansliSayiIkinciBasamak == tahminEdilenSayiBirinciBasamak) {
                kazanc = 5000;
            } else if (sansliSayiBirinciBasamak == tahminEdilenSayiBirinciBasamak
                    || sansliSayiBirinciBasamak == tahminEdilenSayiIkinciBasamak
                    || sansliSayiIkinciBasamak == tahminEdilenSayiBirinciBasamak
                    || sansliSayiIkinciBasamak == tahminEdilenSayiIkinciBasamak) {
                kazanc = 1000;
            } else {
                kazanc = -500;
            }

            bakiye += kazanc;
            if (kazanc > 0) {
                toplamKazanc += kazanc;
            } else {
                toplamKayip -= kazanc;
            }

            System.out.println("Tebrikler! Kazanç/Kayıp: " + kazanc + " TL. Sanslı sayı: " + sansliSayi + " Sizin tahmininiz: " + tahminEdilenSayi);

            System.out.println("Kalan Bakiye :" + bakiye + " TL ");
            System.out.print("Tekrar oynamak istiyor musunuz? (Evet(e)/Hayır(h)): ");
            String devamCevabi = scanner.next().toLowerCase();
            devam = devamCevabi.equals("e");
        }

        System.out.println("Oyunu tamamladınız, " + kullaniciAdi + "! Toplam Kazanç: " + toplamKazanc + " TL, Toplam Kayıp: " + toplamKayip + " TL, Son Bakiye: " + bakiye + " TL");
    }
}
