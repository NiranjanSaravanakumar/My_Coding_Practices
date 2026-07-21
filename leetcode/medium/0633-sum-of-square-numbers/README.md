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

**Language:** Java  
**Runtime:** 4 ms (beats 82.74%)  
**Memory:** 42.4 MB (beats 5.31%)  
**Submitted:** 2026-07-21T03:32:02.677Z  

```java
class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right =(long) Math.sqrt(c);

        while(left <= right){
            long sum = left * left + right * right;
            if(sum == c){
                return true;
            }
            else if(sum < c){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sum-of-square-numbers/)