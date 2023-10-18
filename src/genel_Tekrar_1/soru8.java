package genel_Tekrar_1;

import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {
        //Aşşağıda tanımı verilen f(x,y) fonksiyonunu klavyeden girilen x ve y değerleri için hesapla
        /*
        x>0  y<0 ise f(x,y) = 4x+2y+4
        x>0 y=0 ise f(x,y) = 2x-y+3
        x<0, y>0 ise f(x,y) =3x+4y+3
         */
        Scanner hesapla =new Scanner(System.in);
        System.out.println("Bir x değeri giriniz :");
        int x=hesapla.nextInt();
        System.out.println("Bir y değeri giriniz :");
        int y=hesapla.nextInt();
        if (x>0 && y<0)
            System.out.println("F("+(4*x+2*y+4)+")");
        else if (x>0 && y==0)
            System.out.println("F("+(2*x-y+3)+")");
        else if (x<0 && y>0)
            System.out.println("F("+(3*x+4*y+3)+")");{

        }
        {

        }
    }
}