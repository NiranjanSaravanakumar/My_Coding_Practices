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
**Runtime:** 57 ms (beats 67.15%)  
**Memory:** 19.4 MB (beats 25.20%)  
**Submitted:** 2026-07-21T03:35:29.340Z  

```py
class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        l = 0
        r = int(sqrt(c))

        while l<= r:
            sum = l*l + r*r
            if sum == c:
                return True
            elif sum < c:
                l += 1
            else:
                r -= 1
        return False
```

---

[View on LeetCode](https://leetcode.com/problems/sum-of-square-numbers/)