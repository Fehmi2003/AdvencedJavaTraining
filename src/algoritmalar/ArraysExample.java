package algoritmalar;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // Dizi oluşturma
        int[] arr = {5, 2, 9, 1, 5, 6};

        // Dizi sıralama
        Arrays.sort(arr);
        System.out.println("Sıralanmış Dizi: " + Arrays.toString(arr));

        // Dizi içinde eleman arama
        int key = 5;
        int index = Arrays.binarySearch(arr, key);
        if (index >= 0) {
            System.out.println(key + " dizide bulundu, index: " + index);
        } else {
            System.out.println(key + " dizide bulunamadı.");
        }

        // Dizi kopyalama
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Kopyalanan Dizi: " + Arrays.toString(copy));

        // Dizi doldurma
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Doldurulmuş Dizi: " + Arrays.toString(filledArray));

        // Dizi karşılaştırma
        int[] arr2 = {5, 2, 9, 1, 5, 6};
        boolean isEqual = Arrays.equals(arr, arr2);
        System.out.println("Diziler eşit mi? " + isEqual);

        // Dizi dönüşümü
        String[] strArray = {"Java", "Python", "C++", "JavaScript"};
        String[] copyStrArray = Arrays.copyOf(strArray, strArray.length, String[].class);
        System.out.println("String Dizi: " + Arrays.toString(copyStrArray));
    }
}
