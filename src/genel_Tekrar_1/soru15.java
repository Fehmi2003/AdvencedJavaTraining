package genel_Tekrar_1;

import java.util.Scanner;

//Kullanıcıdan aldığınız integer değere kadar olan tüm asal sayıları yazdıran programı yazınız.
//10 için ekranda 2,3,5,7 değerleri olmalıdır.
public class soru15 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("Üst sınırı giriniz");
        int girilenSayi = tara.nextInt();
        for(int i =2; i<=girilenSayi; i++){
            boolean asalMi=true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    asalMi = false;
                    break;
                }
            }
            if(asalMi)
                System.out.print(i+",");
        }
    }
}