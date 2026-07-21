# Sum of Square Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a non-negative integer `c`, decide whether there're two integers `a` and `b` such that `a2 + b2 = c`.

 

 **Example 1:** 

```
Input: c = 5
Output: true
Explanation: 1  *1 + 2*  2 = 5

```

 **Example 2:** 

```
Input: c = 3
Output: false

```

 

 **Constraints:** 

- 0 <= c <= 231 - 1

## Solution

**Language:** Python  
**Runtime:** 52 ms (beats 91.70%)  
**Memory:** 19.2 MB (beats 97.70%)  
**Submitted:** 2026-07-21T03:35:59.694Z  

```py
class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        l = 0
        r = isqrt(c)

        while l <= r:
            total = l * l + r * r

            if total == c:
                return True
            elif total < c:
                l += 1
            else:
                r -= 1

        return False
```

---

[View on LeetCode](https://leetcode.com/problems/sum-of-square-numbers/)