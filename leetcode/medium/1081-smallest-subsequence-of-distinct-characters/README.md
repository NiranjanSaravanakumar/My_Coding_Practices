# Smallest Subsequence of Distinct Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, return  *the  **lexicographically smallest*   *subsequence**  of*  `s`  *that contains all the distinct characters of*  `s`  *exactly once*.

 

 **Example 1:** 

```
Input: s = "bcabc"
Output: "abc"

```

 **Example 2:** 

```
Input: s = "cbacdcbc"
Output: "acdb"

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- s consists of lowercase English letters.

 

 **Note:**  This question is the same as 316: https://leetcode.com/problems/remove-duplicate-letters/

## Solution

**Language:** Python  
**Runtime:** 1 ms (beats 54.00%)  
**Memory:** 19.3 MB (beats 39.11%)  
**Submitted:** 2026-07-19T15:03:34.416Z  

```py
class Solution:
    def smallestSubsequence(self, s: str) -> str:
        # Store last occurrence of each character
        last_index = {}
        for i, ch in enumerate(s):
            last_index[ch] = i

        stack = []
        visited = set()

        for i, ch in enumerate(s):

            # Skip if already included
            if ch in visited:
                continue

            # Remove larger characters if they appear later
            while stack and stack[-1] > ch and last_index[stack[-1]] > i:
                visited.remove(stack.pop())

            stack.append(ch)
            visited.add(ch)

        return "".join(stack)
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/)