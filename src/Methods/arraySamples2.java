package Methods;

import java.util.Scanner;

public class arraySamples2 {
    public static void main(String[] args) {
        //Soru 3
        //Kullanıcıdan kaç tane sayının ortalamasını bulmasını istediğini
        //sorun ve buna bağlı olarak aldıgınız değerleri bir dizide saklayın.
        //Veri alma işlemi bittikten sonra tüm sayıları ve ortalamasını ekrana
        //yazdırın.
        System.out.println("Kaç tane sayının ortalamasını bulmak istiyorsunuz ?");
        Scanner tara =new Scanner(System.in);
        int sayi=tara.nextInt();
        int kulllaniciSayilari[]=new int[sayi];
        double ortalam=0;
        for (int i=0;i<sayi;i++){
            System.out.println("Sayi giriniz : \n");
            kulllaniciSayilari[i]=tara.nextInt();
            ortalam=ortalam+kulllaniciSayilari[i];

        }
        System.out.println("Girdiğiniz Sayıların Ortalaması :"+(ortalam/kulllaniciSayilari.length));

    }
}
