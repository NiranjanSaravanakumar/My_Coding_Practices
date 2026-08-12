# Two sum -Pairs with 0 Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array  **arr**, return all the  **unique** pairs [arr[i], arr[j]] such that **i != j** and **arr[i] + arr[j] == 0.** 

Note: The pairs must be returned in  **sorted** order, the solution array should also be  **sorted**, and the answer must not contain any  **duplicate** pairs.

 **Examples:** 

```
Input: arr = [-1, 0, 1, 2, -1, -4]
Output: [[-1, 1]]
Explanation: arr[0] + arr[2] = (-1)+ 1 = 0.
arr[2] + arr[4] = 1 + (-1) = 0.
The distinct pair are [-1,1].

```

```
Input: arr = [6, 1, 8, 0, 4, -9, -1, -10, -6, -5]
Output: [[-6, 6],[-1, 1]]
Explanation: The distinct pairs are [-1, 1] and [-6, 6].
```

**Constraints:
**3 ≤ arr.size ≤ 105
-105 ≤ arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-12T03:49:08.605Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1)