package odev_Sorulari;
/*
* 1 Aşağıdaki ifadeleri hesaplayıp ekrana bastırın ve sonuçları yorumlayın.
String stringSayı ="150”;
integer bir değişken oluşturup içine yukarıdaki metin olarak verilen ifadeyi
atayıp ekrana yazdırınız. Sonrasında bu değeri tekrar metine çevirip ekrana
yazdırınız.*/
public class Bolum2_Odev1 {
 //SORU 1
    public static void main(String[] args) {
        String stringSayi ="150";
        int degisken ='a';
        int degisken1 ='a';
        System.out.println("String Sayı Değer: "+stringSayi);
        stringSayi= String.valueOf(degisken);
        System.out.println("Yeni Dönüşüm : "+degisken);
        System.out.println("**************************");


    //SORU 2
    /*
    * 2 Aşağıdaki İfadeleri hesaplayıp ekrana bastırın ve sonuçlan yorumlayın.
    int sayi1 5/3;
    * float sayi2 5f/3f;
    * double sayi3 5d/3d;
    */
    int sayi1 =5/3;
     float sayi2 =5f/3f;
    double sayi3 = 5d/3d;
        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(sayi3);
        System.out.println("***************");
        //Soru 3
        //3 Aşağıdaki ifadelerin sonucu nedir ve sonucu yorumlayın.
        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);
        System.out.println(1.0-0.9);
        System.out.println("*****************");
        //Soru 4
        /*Aşağıdaki İfadelerin sonuçlarını ekrana yazdırın ve sonucu yorumlayın. */
        int number1=1;
        int number2=2;
        double average1=(number2+number1)/2;
        System.out.println(average1);
        double average2=(number2+number1)/2.0;
        System.out.println(average2);
}
    }
    //GARBAGE COLLECTOR: Otomatik olarak kullanılmayan başı boş veri tiplerini siliyor. Böylelikle bellek daha az yorulmuş oluyor.


