package Methods;

public class Methods1 {
    public static void main(String[] args) {
        //Geriye değer döndürmeyen metodların dönüş tipi void olur.
        menuGoster();
        sayilariTopla(3,6);
        sayilariTopla(99,55);
    }
    public static void sayilariTopla(int birinciSayi, int ikinciSayi){

        System.out.println("Toplam : "+(birinciSayi+ikinciSayi));
    }
    public static void menuGoster(){
        System.out.println("*** Menü ***");
        System.out.println("1- İki Sayının Toplamını Bul");
        System.out.println("2- İki Sayının Farkını Bul");
        System.out.println("3- İki Sayının Çarpımını Bul");
    }
}
