public class SelectionSort {


    public static void selectionSortT(int[] arr, int n) {
        // Outer loop runs from 0 to n-2 [00:09:13]
        for (int i = 0; i <= n - 2; i++) {
            int mini = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int [] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
        selectionSortT(arr,n);
        System.out.print("Sorted array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
