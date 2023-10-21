package genel_tekrar_2;

public class soru1 {
    public static void main(String[] args) {
        //100 elemanlı bir dizi oluşturun ve bu dizinin tüm elemanlarını
        //rastgele olacak şekilde üretin. Bu işlemden sonra dizideki
        //elemanların ortalamasını hesaplayarak bu ortalamanın altında kaç
        //tane eleman olduğunu yazdırın.
        int sayilar[]=new int [100];
        int tumSayilarToplam =0;
        for(int i=0; i<sayilar.length; i++){
            int rastgeleSayi = (int)(Math.random() * 100);
            sayilar[i] = rastgeleSayi;
            tumSayilarToplam += rastgeleSayi;
            // tumSayilarinToplami = tumSayilarinToplami +rastgeleSayi;
        }
        double ortalama = (double) tumSayilarToplam / (double)sayilar.length;
        int ortalamaAltindakiDegerlerinSayisi = 0;
        for (int i=0 ; i<sayilar.length; i++){
            if(sayilar[i] < ortalama){
                ortalamaAltindakiDegerlerinSayisi++;
            }
        }
        System.out.println("Ortalama : "+ortalama + " ve ortalamanın altındaki değerlerin sayısı : "+ortalamaAltindakiDegerlerinSayisi);
    }
}



