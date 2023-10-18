package genel_Tekrar_1;

public class soru6 {
    public static void main(String[] args) {
        // 1'den 10'a kadar olan sayıları sırayla ve aralarında virgül olacak şekilde yazan bir uygulamayı for döngüsü kullanarak yaz.
        // 1,2,3, .. . . .. 9,10
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.print(i);

            if (i < 10) {
                System.out.print(",");
            }
        }
    }
}
