package Methods;

import java.util.Scanner;
//Soru 2
//Kullanıcıdan hangi ayda olduğunu bilgisini alıp ilgili ay değerini
//yazdırın. Ay adlarını bir dizide saklayın.
public class arraySamples1 {
    public static void main(String[] args) {
        String []aylar={"Ocak","şubat","mart","nisan","mayıs"};
        Scanner tara=new Scanner(System.in);
        System.out.println("Ay değerinini rakamla yazınız");
        int ay = tara.nextInt();
        System.out.println("Seçtiğiniz ay:"+aylar[ay-1]);
    }
}
