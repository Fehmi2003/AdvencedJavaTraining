package algoritmalar;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Hedef bulundu
            } else if (arr[mid] < target) {
                left = mid + 1; // Hedef, sağ tarafındadır
            } else {
                right = mid - 1; // Hedef, sol tarafındadır
            }
        }

        return -1; // Hedef bulunamadı
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Hedef bulunamadı.");
        } else {
            System.out.println("Hedef " + target + " dizinin indeksi: " + result);
        }
    }
}
