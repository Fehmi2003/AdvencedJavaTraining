package Methods;

public class foreach {
    public static void main(String[] args) {
        int []sayilar ={1,5,7,-9,62};
        for (int i=0; i<sayilar.length;i++){
            System.out.println("Eleman :"+sayilar[i]);
        }
        for (int oankiSayi: sayilar)
            System.out.println("For each Eleman :"+oankiSayi);
        String isimler[]={"Fehmi","Emirhan","Furkan"};
        for (String isim :isimler)
            System.out.println("For each İsim :"+isim);
    }


}
