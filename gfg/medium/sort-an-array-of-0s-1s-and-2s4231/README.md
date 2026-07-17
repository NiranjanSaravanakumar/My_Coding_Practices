# Sort 0s, 1s and 2s

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  containing only  **0s, 1s, and 2s.**  Sort the array in ascending order.
 **Note:**  You need to solve this problem without utilizing the built-in sort function.

 **Examples:** 

```
Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
```

```
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
```

 **Follow up:**  Could you come up with a one-pass algorithm using only constant extra space?

 **Constraints:** 
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 2

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-17T18:06:07.736Z  

```java
class Solution {
    public void sort012(int[] arr) {
        int n = arr.length;
        int l = 0 , m =0 , h =n-1;
        
        while(m<=h){
            if(arr[m] == 0){
                int t = arr[m];
                arr[m] = arr[l];
                arr[l] = t;
                m++;
                l++;
            }
            else if (arr[m] == 1){
                m++;
            }
            else{
                int t = arr[m];
                arr[m] = arr[h];
                arr[h] = t;
                h--;
            }
        }
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1)