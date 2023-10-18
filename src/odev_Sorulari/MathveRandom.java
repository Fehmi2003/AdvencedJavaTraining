package odev_Sorulari;

public class MathveRandom {
    public static void main(String[] args) {
        System.out.println("pi sayisi"+Math.PI);
        System.out.println("pi sayisi"+Math.E);
        System.out.println("-5 in mutlak değeri"+Math.abs(-5));
        System.out.println("10 mü büyük 11 mi ? "+Math.max(10,11));
        System.out.println(" 3 mü küçük -3 mü ? "+Math.min(3,-3));
        Math.random(); //0.0 - 0.9999999999 araası değer üretir.
        int onaKadarRasgeleSayi =(int)(Math.random()*10+1);
        System.out.println("Rasgele sayi : "+onaKadarRasgeleSayi);
        //eğer üretilecek rasgele sayinini 0 da olmasını istiyorsanız
        //Math.random()*(üst_sinir+)
        //eğer üretilecek random sayının 0 olmasını istemiyorsanız
        // (Math.random()*üst_sinir)+1
    }
}
