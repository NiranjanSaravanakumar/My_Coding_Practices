# Duplicates in a Limited Range Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  of size **n**, containing elements from the range  **1** to **n**, and each element appears at most  **twice**, return an array of all the integers that appears twice.

 **Note:**  You can return the elements in any order but the driver code will print them in sorted order.

 **Examples:** 

```
Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3] 
Explanation: 2 and 3 occur more than once in the given array.
```

```
Input: arr[] = [3, 1, 2] 
Output: []
Explanation: There is no repeating element in the array, so the output is empty.
```

**Constraints:
**1 ≤ n ≤ 106
1 ≤ arr[i] ≤ n

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-15T05:12:23.795Z  

```java
class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {

        Arrays.sort(arr);

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {

                if (res.isEmpty() || res.get(res.size() - 1) != arr[i])
                    res.add(arr[i]);
            }
        }

        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1)