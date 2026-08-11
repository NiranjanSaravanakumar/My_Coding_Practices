# At Least K Occurrences

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr**. Return the element that occurs at least **k**  number of times.

 *Note:* 

- If there are multiple answers, please return the first one.
- If there is no element found, return -1.

 **Examples** 

```
Input: arr[] = [1, 7, 4, 3, 4, 8, 7], k = 2
Output: 4
Explanation: Both 7 and 4 occur 2 times. But 4 is first that occurs twice. As the index = 4, is the first element.
```

```
Input:  arr[] = [3, 1, 3, 4, 5, 1, 3, 3, 5, 4], k = 3
Output: 3
Explanation: Here, 3 is the only number that appeared atleast 3 times in the array.

```

```
Input: arr[] = [10, 8, 2], k = 10
Output: -1
Explanation: Here no element is returning atleast 10 number of times, so -1.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
1 ≤ k ≤ 103
0 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-11T10:18:58.471Z  

```java
class Solution {
    public int firstElementKTime(int[] arr, int k) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.get(arr[i]).add(i);
            }
            else{
            ArrayList<Integer> cur = new ArrayList<>();
            cur.add(i);
            map.put(arr[i],cur);
            }
            set.add(arr[i]);
        }
        int res = -1;
        int ci = Integer.MAX_VALUE;
        for(int x : set){
            if(map.get(x).size() >= k){
                if(ci > map.get(x).get(k-1) ){
                    res = x;
                    ci = map.get(x).get(k-1);
                }
            }
        }
        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1)