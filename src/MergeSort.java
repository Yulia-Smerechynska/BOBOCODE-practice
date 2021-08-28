public class MergeSort {

    /*Parameter                                   InsertionSort                   MergeSort

    * Time                                             less                         more
    * Memory                                           less                         more
    * Partially sorted array as input             less iteration                 more iterations
    * Complexity                                       O(n^2)                      O(n*log(n))
    * */

    public static void main(String[] args) {

        int[] actual = {5, 1, 6, 2, 3, 4};
        mergeSort(actual, actual.length);
        for (int i : actual) {
            System.out.println(i);
        }
    }

    public static void mergeSort(int[] arr, int n) {
        if (n < 2) {
            return;
        }
        int middleArray = n / 2;
        int subtraction = n - middleArray;
        int[] left = new int[middleArray];
        int[] right = new int[subtraction];

        for (int i = 0; i < middleArray; i++) {
            left[i] = arr[i];
        }

        for (int i = middleArray; i < n; i++) {
            right[i - middleArray] = arr[i];
        }

        mergeSort(left, middleArray);
        mergeSort(right, subtraction);

        merge(arr, left, right, middleArray, subtraction);
    }

    public static void merge(int[] arr, int[] left, int[] right, int leftIndex, int rightIndex) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftIndex && j < rightIndex) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < leftIndex) {
            arr[k++] = left[i++];
        }
        while (j < rightIndex) {
            arr[k++] = right[j++];
        }
    }
}
