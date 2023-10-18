package genel_Tekrar_1;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        //Klavyeden Kenarları girilen bir üçgenin çeşidini veren uygulamayı yazınız.
        System.out.println("Üçgen Çeşidi bulan uygulamaya hoşgeldiniz !!!");
        Scanner cesit =new Scanner(System.in);
        int a,b,c = 0;
        String ucgenCesidi = "x";
        System.out.println("Lütfen üçgenin 1. kenarını giriniz :");
        a=cesit.nextInt();
        System.out.println("Lütfen üçgenin 2. kenarını giriniz :");
        b=cesit.nextInt();
        System.out.println("Lütfen üçgenin 3. kenarını giriniz :");
        c=cesit.nextInt();
        if (a==b && b==c) System.out.println("Üçgen eşitkenar");
        else if ((a!=b)&&(a!=c)&&(a!=c))
            System.out.println("Üçgen Çeşitkenardır");
        else System.out.println("Üçken ikizkenardır");
        System.out.println("Program bitti Teşşekkürler.");
    }
}
