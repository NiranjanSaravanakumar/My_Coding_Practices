import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // Step 1: Sort the array
        Arrays.sort(arr);
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;
        
        // Step 2: Two pointers approach
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == 0) {
                // Found a valid pair
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                result.add(pair);
                
                // Move both pointers inward
                left++;
                right--;
                
                // Skip duplicate elements from the left
                while (left < right && arr[left] == arr[left - 1]) {
                    left++;
                }
                
                // Skip duplicate elements from the right
                while (left < right && arr[right] == arr[right + 1]) {
                    right--;
                }
                
            } else if (sum < 0) {
                // Sum is too small, move left pointer to increase sum
                left++;
            } else {
                // Sum is too large, move right pointer to decrease sum
                right--;
            }
        }
        
        return result;
    }
}