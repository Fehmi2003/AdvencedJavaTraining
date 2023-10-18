package genel_Tekrar_1;

import java.util.Scanner;

public class soru13 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        int sayi1 = tara.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int sayi2 = tara.nextInt();
        int ebob = 1;
        int kontrol = 2;
        while(kontrol <= sayi1 && kontrol <= sayi2){
            if(sayi1 % kontrol == 0 && sayi2 % kontrol ==0){
                ebob = kontrol;
            }
            kontrol++;
        }
        if(ebob==1){
            System.out.println(sayi1 +" ve " + sayi2+ " aralarında asaldır");
        }else{
            System.out.println(sayi1 +" ve " + sayi2+ " sayılarının en büyük ortak böleni : "+ebob);
        }
    }
}