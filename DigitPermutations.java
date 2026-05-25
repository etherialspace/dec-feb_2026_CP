import java.util.*;

public class DigitPermutations {
    
    public static void main(String[] args) {
        int number = 2498;
        char[] digits = String.valueOf(number).toCharArray();
        
        List<String> result = new ArrayList<>();
        generatePermutations(digits, 0, result);
        
        System.out.println("All combinations of " + number + ":");
        for (String perm : result) {
            System.out.println(perm);
        }
    }
    
    private static void generatePermutations(char[] arr, int index, List<String> result) {
        if (index == arr.length - 1) {
            result.add(new String(arr));
            return;
        }
        
        for (int i = index; i < arr.length; i++) {
            // Swap current with index
            swap(arr, index, i);
            generatePermutations(arr, index + 1, result);
            // Backtrack
            swap(arr, index, i);
        }
    }
    
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
