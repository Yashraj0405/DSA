public class InsertionSort {

    private static void selectionSortT(int [] arr, int n){
        for(int i = 0 ; i <= n-1;i++){
            int j = i;
            while(j > 0 && arr[j-1]> arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {12, 11, 13, 5, 6};
        int n = arr.length;
        selectionSortT(arr,n);
        System.out.print("Sorted array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
