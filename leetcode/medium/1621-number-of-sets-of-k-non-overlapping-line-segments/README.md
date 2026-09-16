# Number of Sets of K Non-Overlapping Line Segments

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given `n` points on a 1-D plane, where the `ith` point (from `0` to `n-1`) is at `x = i`, find the number of ways we can draw  **exactly**  `k`  **non-overlapping**  line segments such that each segment covers two or more points. The endpoints of each segment must have  **integral coordinates**. The `k` line segments  **do not**  have to cover all `n` points, and they are  **allowed**  to share endpoints.

Return  *the number of ways we can draw* `k` *non-overlapping line segments **.*  Since this number can be huge, return it** modulo** `109 + 7`.

 

 **Example 1:** 

```
Input: n = 4, k = 2
Output: 5
Explanation: The two line segments are shown in red and blue.
The image above shows the 5 different ways {(0,2),(2,3)}, {(0,1),(1,3)}, {(0,1),(2,3)}, {(1,2),(2,3)}, {(0,1),(1,2)}.

```

 **Example 2:** 

```
Input: n = 3, k = 1
Output: 3
Explanation: The 3 ways are {(0,1)}, {(0,2)}, {(1,2)}.

```

 **Example 3:** 

```
Input: n = 30, k = 7
Output: 796297179
Explanation: The total number of possible ways to draw 7 line segments is 3796297200. Taking this number modulo 109 + 7 gives us 796297179.

```

 

 **Constraints:** 

- 2 <= n <= 1000
- 1 <= k <= n-1

## Solution

**Language:** Java  
**Runtime:** 38 ms (beats 58.71%)  
**Memory:** 56.1 MB (beats 77.42%)  
**Submitted:** 2026-09-16T16:40:53.218Z  

```java
class Solution {
    private static final int MOD = 1_000_000_007;
    public int numberOfSets(int n, int k) {
        int[][] dp = new int[k + 1][n + 1];

        for (int pos = 0; pos <= n; pos++) {
            dp[0][pos] = 1;
        }
        for (int segments = 1; segments <= k; segments++) {
            int[] prevRowSum = new int[n + 1];

            for (int pos = n - 1; pos >= 0; pos--) {
                prevRowSum[pos] =  (int) ((prevRowSum[pos + 1] + dp[segments - 1][pos]) % MOD);
            }
            for (int pos = n - 1; pos >= 0; pos--) {
                long ways = dp[segments][pos + 1];

                ways += prevRowSum[pos + 1];
                dp[segments][pos] = (int) (ways % MOD);
            }
        }
        return dp[k][0];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-sets-of-k-non-overlapping-line-segments/)