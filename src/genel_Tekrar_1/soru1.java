package genel_Tekrar_1;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        //Klavyeden girilen 3 sayının ortalamasını alan bir uygulama yazın
        Scanner ortalama =new Scanner(System.in);
        int a,b,c=0;
        double d=0.0;
        System.out.println("3 Sayının Ortalamasını Bulan Uygulamaya Hoşgeldiniz !!! ");
        System.out.println("Birinci sayıyı giriniz :");
        a=ortalama.nextInt();
        System.out.println("İkinci sayıyı giriniz :");
        b=ortalama.nextInt();
        System.out.println("Üçüncü sayıyı giriniz :");
        c=ortalama.nextInt();
        d=(a+b+c)/3;
        System.out.println("Ortalama :"+d);

    }
}/*
System.out.print("Adınızı giriniz: ");
        String kullaniciAdi = scanner.nextLine();
        Scanner tara =new Scanner(System.in);
        int kullanicininGirdigiSayi =tara.nextInt();
        System.out.println("Değer"+kullanicininGirdigiSayi);*/