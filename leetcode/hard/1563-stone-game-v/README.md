# Stone Game V

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

There are several stones  **arranged in a row**, and each stone has an associated value which is an integer given in the array `stoneValue`.

In each round of the game, Alice divides the row into  **two non-empty rows**  (i.e. left row and right row), then Bob calculates the value of each row which is the sum of the values of all the stones in this row. Bob throws away the row which has the maximum value, and Alice's score increases by the value of the remaining row. If the value of the two rows are equal, Bob lets Alice decide which row will be thrown away. The next round starts with the remaining row.

The game ends when there is only  **one stone remaining**. Alice's score is initially  **zero**.

Return  *the maximum score that Alice can obtain*.

 

 **Example 1:** 

```
Input: stoneValue = [6,2,3,4,5,5]
Output: 18
Explanation: In the first round, Alice divides the row to [6,2,3], [4,5,5]. The left row has the value 11 and the right row has value 14. Bob throws away the right row and Alice's score is now 11.
In the second round Alice divides the row to [6], [2,3]. This time Bob throws away the left row and Alice's score becomes 16 (11 + 5).
The last round Alice has only one choice to divide the row which is [2], [3]. Bob throws away the right row and Alice's score is now 18 (16 + 2). The game ends because only one stone is remaining in the row.

```

 **Example 2:** 

```
Input: stoneValue = [7,7,7,7,7,7,7]
Output: 28

```

 **Example 3:** 

```
Input: stoneValue = [4]
Output: 0

```

 

 **Constraints:** 

- 1 <= stoneValue.length <= 500
- 1 <= stoneValue[i] <= 106

## Solution

**Language:** Java  
**Runtime:** 30 ms (beats 95.67%)  
**Memory:** 53 MB (beats 5.05%)  
**Submitted:** 2026-08-17T16:17:17.332Z  

```java
class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stoneValue[i];
        }

        int[][] dp = new int[n][n];
        int[][] maxLeft = new int[n][n];
        int[][] maxRight = new int[n][n];

        for (int i = 0; i < n; i++) {
            maxLeft[i][i] = stoneValue[i];
            maxRight[i][i] = stoneValue[i];
        }

        for (int l = n - 2; l >= 0; l--) {
            int mid = l;

            for (int r = l + 1; r < n; r++) {

                while (mid < r - 1 && getSum(prefix, l, mid) < getSum(prefix, mid + 1, r)) {
                    mid++;
                }

                int best = 0;

                if (mid > l) {
                    best = Math.max(best, maxLeft[l][mid - 1]);
                }

                int leftSum = getSum(prefix, l, mid);
                int rightSum = getSum(prefix, mid + 1, r);

                if (leftSum < rightSum) {
                    best = Math.max(best, leftSum + dp[l][mid]);
                } else if (leftSum > rightSum) {
                    best = Math.max(best, rightSum + dp[mid + 1][r]);
                } else {
                    best = Math.max(best, leftSum + Math.max(dp[l][mid], dp[mid + 1][r]));
                }

                if (mid + 2 <= r) {
                    best = Math.max(best, maxRight[mid + 2][r]);
                }

                dp[l][r] = best;

                int totalSum = getSum(prefix, l, r);
                maxLeft[l][r] = Math.max(maxLeft[l][r - 1], totalSum + dp[l][r]);
                maxRight[l][r] = Math.max(maxRight[l + 1][r], totalSum + dp[l][r]);
            }
        }

        return dp[0][n - 1];
    }

    private int getSum(int[] prefix, int l, int r) {
        return prefix[r + 1] - prefix[l];
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/stone-game-v/)