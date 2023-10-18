package odev_Sorulari;


public class Bolum3_Odev3 {
    public static void main(String[] args) {

        /*Ödev 1
        Bir integer değişken oluşturun ve bu değişkende saniye değerini tutun.
        Sonra bu saniye değerinin kaç dakika ve saniyeye denk geldiğini yazdırın
        Örnek 1200 değeri için 20 dakika 0 saniye yazmalıdır.*/
        int saniye =1250;
        int dakika =saniye/60;
        int kalanSaniye=saniye%60;
        System.out.println("Girdiğiniz "+saniye+"Saniye= "+dakika+"dakika ve "+kalanSaniye+"Kalan saniyeye eşittir.");

        System.out.println("****************");
        //Ödev 2
        //Bir double değişken oluşturun ve bu değişkende fahrenheit cinsinden sıcaklığı
        //saklayın.
        //Sonrasında bu değerin kaç Celcius olduğunu hesaplayın.
        //100 değeri için 37.777778 gibi bir değer elde etmelisiniz.
        //Hesaplama formülü : celcius = 5/9 * (fahrenheit -32)
        double fahrenheit=100.0d;
        double celcius =(5.0/9.0)*(fahrenheit-32);
        System.out.println("Fahrenheit degeri: "+fahrenheit+" celcius degeri: "+celcius +" dur.");
        //ÖDEV 3
        //Bir yıl değerinin artık yıl olup olmadığını hesaplayın
        //Bir yılın artık olması için ya 400 ile modu 0 olmalı yada 4 ile modu 0 olmalı
        //e 100 ile modu 0 olmamalı
        //4100 false değer vermeli.
        System.out.println("*********");
        int yil =4100;
        boolean artikYilmi =(yil%400==0)||(yil%4==0 && yil%100!=0);
        System.out.println("Girilen yıl: "+yil+"yılı artık yilmi ? "+artikYilmi);
    }
}
