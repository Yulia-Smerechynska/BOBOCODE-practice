public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 9};
        insertionSort(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            System.out.println("current " + current);
            int j = i - 1;
            System.out.println("j init " + j);
            while (j >= 0 && current < arr[j]) {
                System.out.println("before " + arr[j + 1] + ", " + arr[j]);
                arr[j + 1] = arr[j];
                System.out.println("after " + arr[j + 1] + ", " + arr[j]);
                j--;
                System.out.println("j-- " + j);
            }
            arr[j + 1] = current;
            System.out.println("current2 " + arr[j + 1]);
        }
    }
}
