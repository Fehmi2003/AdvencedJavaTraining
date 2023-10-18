package genel_Tekrar_1;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        //1 den 100 e kadar olan sayıların toplamını bulan uygulamayı yazınız.
        //(n.(n-1))/2
        int i=0; double toplam=0.0;
        Scanner toplamBul =new Scanner(System.in);
        System.out.println("Hangi sayının 1 den 100 e kadar toplamını bulmak istiyorsunuz ?");
        int sayi= toplamBul.nextInt();
        toplam=(sayi*(sayi-1))/2;
        System.out.println("Sayıların Toplamı :"+toplam);

    }
}
