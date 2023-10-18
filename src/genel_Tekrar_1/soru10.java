package genel_Tekrar_1;

import java.util.Scanner;

public class soru10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan çarpım tablosu boyutunu alın
        System.out.print("Çarpım tablosu boyutunu girin: ");
        int boyut = scanner.nextInt();

        // Çarpım tablosunu oluşturun ve ekrana yazdırın
        for (int i = 1; i <= boyut; i++) {
            for (int j = 1; j <= boyut; j++) {
                // Çarpım sonucunu hesaplayın ve ekrana yazdırın
                int carpim = i * j;
                System.out.print(i + "x" + j + "=" + carpim);

                // Son sütunda olmadıysak virgül ekleyin
                if (j < boyut) {
                    System.out.print(", ");
                }
            }
            // Bir satırı tamamlayın
            System.out.println();
        }

        scanner.close();
    }
}

