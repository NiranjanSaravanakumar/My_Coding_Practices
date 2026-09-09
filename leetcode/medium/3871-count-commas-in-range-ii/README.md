# Count Commas in Range II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer `n`.

Return the  **total**  number of commas used when writing all integers from `[1, n]` (inclusive) in  **standard**  number formatting.

In  **standard**  formatting:

- A comma is inserted after every three digits from the right.
- Numbers with fewer than 4 digits contain no commas.

 

 **Example 1:** 

 **Input:**  n = 1002

 **Output:**  3

 **Explanation:** 

The numbers `"1,000"`, `"1,001"`, and `"1,002"` each contain one comma, giving a total of 3.

 **Example 2:** 

 **Input:**  n = 998

 **Output:**  0

 **Explanation:** 

 **​​​​​​​** All numbers from 1 to 998 have fewer than four digits. Therefore, no commas are used.

 

 **Constraints:** 

- 1 <= n <= 1015

## Solution

**Language:** Python  
**Runtime:** 3 ms (beats 19.73%)  
**Memory:** 19.2 MB (beats 87.75%)  
**Submitted:** 2026-09-09T15:06:12.779Z  

```py
class Solution:
    def countCommas(self, n: int) -> int:
        commas = 0
        threshold = 1000

        while threshold <= n:
            commas += n - threshold + 1
            threshold *= 1000

        return commas
```

---

[View on LeetCode](https://leetcode.com/problems/count-commas-in-range-ii/)