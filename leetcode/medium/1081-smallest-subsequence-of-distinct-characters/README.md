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

**Language:** Java  
**Runtime:** 3 ms (beats 71.44%)  
**Memory:** 43 MB (beats 47.01%)  
**Submitted:** 2026-07-19T14:56:39.484Z  

```java
class Solution {
    public String smallestSubsequence(String s) {
        int[] lastIndex = new int[26];
        // Store last occurrence of each character
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        boolean[] visited = new boolean[26];
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Skip if already included
            if (visited[ch - 'a'])  continue;
            // Remove larger characters if they appear later
            while (!stack.isEmpty()  && stack.peek() > ch && lastIndex[stack.peek() - 'a'] > i) {
                visited[stack.pop() - 'a'] = false;
            }
            stack.push(ch);
            visited[ch - 'a'] = true;
        }
        StringBuilder ans = new StringBuilder();
        for (char c : stack){
            ans.append(c);
        }
        return ans.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/)