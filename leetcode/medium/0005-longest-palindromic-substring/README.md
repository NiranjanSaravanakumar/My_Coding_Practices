# Longest Palindromic Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, return  *the longest*   *palindromic*   *substring*  in `s`.

 

 **Example 1:** 

```
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

```

 **Example 2:** 

```
Input: s = "cbbd"
Output: "bb"

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- s consist of only digits and English letters.

## Solution

**Language:** Java  
**Runtime:** 21 ms (beats 35.35%)  
**Memory:** 47 MB (beats 17.69%)  
**Submitted:** 2026-07-15T05:54:44.035Z  

```java
class Solution {
    public String longestPalindrome(String s) {

        if (s.length() <= 1) return s;

        String result = "";

        for (int i = 0; i < s.length(); i++) {

            // odd length
            int l = i, r = i;
            while (l >= 0 && r < s.length() &&
                   s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            String odd = s.substring(l + 1, r);
            if (odd.length() > result.length()) result = odd;

            // even length
            l = i; r = i + 1;
            while (l >= 0 && r < s.length() &&
                   s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            String even = s.substring(l + 1, r);
            if (even.length() > result.length()) result = even;
        }

        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindromic-substring/)