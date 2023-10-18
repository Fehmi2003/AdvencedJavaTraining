package genel_Tekrar_1;

public class soru4 {
    public static void main(String[] args) {
        //Kendi adınızı ekrana 5 kere yazdıran uygulamayı tüm döngülerle yapınız.
        int i = 0;
        int sayac = 1;
        int j = 0;
        int k = 0;
        for (i = 0; i < 5; i++)
            System.out.println(sayac++ + ". " + "Fehmi");
        System.out.println("****************");

        while (j < 5) {
            System.out.println((j + 1) + ". " + "Fehmi");
            j++;
        }
        System.out.println("*****************");

       do {
           System.out.println((k+1)+". "+"Fehmi");
           k++;

       }
       while (k<5);
        System.out.println("************");






    }
}
