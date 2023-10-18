package odev_Sorulari;

import java.util.Scanner;

public class Bolum4_Odev1 {
    //Ödev 1
    //Kullanıcıdan aldığınız değerlere göre vücut kitle endeksini hesaplayınız.
    //Vücut Kitle Endeksi = kilo(kg) / ((boy(cm)/100) karesi
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int boy = 0;
        double kilo = 0;
        System.out.println("Vücut kitle endex programına hoşgeldiniz");
        System.out.println("Lütfen boyunuzu cm cinsinden giriniz :");
        boy = tara.nextInt();
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz :");
        kilo=tara.nextInt();
        double endeks = 0;
        double cmToMetre = (double) boy / 100 ;
        double boyunKaresi = Math.pow(cmToMetre,2);
        endeks = kilo / boyunKaresi ;
        System.out.println("Bulunan endex değeri :"+endeks);
        if(endeks < 15){
            System.out.println("Çok ciddi derecede düşük kilolu");
        }else if(endeks > 15 && endeks <16){
            System.out.println("Ciddi derecede düşük kilolu");
        }else if(endeks > 16 && endeks < 25){
            System.out.println("Sağlıklı");
        }else if(endeks > 25 && endeks < 40){
            System.out.println("Kilolu");
        }else {
            System.out.println("Aşırı kilolu");
        }
        System.out.println("Program Bitti Teşekkürler.");

    }
}
