public class quicksort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int q = partition(arr, low, high);
            quickSort(arr, low, q - 1);
            quickSort(arr, q + 1, high);       
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i = i + 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 3, 1, 1, 3, 1, 3, 4};
        int high = arr.length - 1;
        quickSort(arr, 0, high);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
