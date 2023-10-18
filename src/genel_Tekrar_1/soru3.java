package genel_Tekrar_1;

import odev_Sorulari.Donguler;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        //Klavyeden girilen vize ve final notlarına göre öğrencinin dersi geçip geçmediğini söyleyen bir uygulama yaz.
        //Geçme notu: 50, vizenin %40, finalin %60ı geçerlidir.
        Scanner GecmeNotu =new Scanner(System.in);
        System.out.println("Geçme ve kalma hesaplayan uygulamaya hoşgeldiniz !!!");

        System.out.println("vize notunuzu giriniz :");
        int vizeNotu =GecmeNotu.nextInt();
        System.out.println("Final notunuzu giriniz :");
        int filanNotu=GecmeNotu.nextInt();
        int gecmeNotu=0;

        if ((vizeNotu *0.4)+(filanNotu *0.6) >=gecmeNotu)
            System.out.println("Tebrikler Dersi Geçtiniz");
        else
            System.out.println("Dersten Kaldınız -__-");
    }
}
