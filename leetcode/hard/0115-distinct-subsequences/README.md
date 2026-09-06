# Distinct Subsequences

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two strings s and t, return  *the number of distinct*   ***subsequences** ** of  *s*  which equals *t.

The test cases are generated so that the answer fits on a 32-bit signed integer.

 

 **Example 1:** 

```
Input: s = "rabbbit", t = "rabbit"
Output: 3
Explanation:
As shown below, there are 3 ways you can generate "rabbit" from s.
rabbbit
rabbbit
rabbbit

```

 **Example 2:** 

```
Input: s = "babgbag", t = "bag"
Output: 5
Explanation:
As shown below, there are 5 ways you can generate "bag" from s.
babgbag
babgbag
babgbag
babgbag
babgbag
```

 

 **Constraints:** 

- 1 <= s.length, t.length <= 1000
- s and t consist of English letters.

## Solution

**Language:** Java  
**Runtime:** 20 ms (beats 53.25%)  
**Memory:** 66.5 MB (beats 6.38%)  
**Submitted:** 2026-09-06T13:27:53.606Z  

```java
class Solution {
    public int numDistinct(String s, String t) {

        int m = s.length();
        int n = t.length();

        // dp[i][j] = number of ways to form t[j...]
        // using s[i...]

        long[][] dp = new long[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            dp[i][n] = 1;
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                if (s.charAt(i) == t.charAt(j)) {

                    dp[i][j] = dp[i + 1][j + 1] + dp[i + 1][j];
                } else {
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }
        return (int) dp[0][0];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/distinct-subsequences/)