# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of size `n`, return  *the majority element*.

The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: 3

```

 **Example 2:** 

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 5 * 104
- -109 <= nums[i] <= 109
- The input is generated such that a majority element will exist in the array.

 

 **Follow-up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.89%)  
**Memory:** 55.7 MB (beats 32.30%)  
**Submitted:** 2026-08-20T08:54:18.464Z  

```java
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;            // vote count
        int candidate = -1; // current candidate

        // Boyer-Moore voting
        for (int num : nums) {
            if (count == 0) {
                candidate = num; // pick new candidate
            }

            if (num == candidate) {
                count++;        // same -> +1
            } else {
                count--;        // different -> -1
            }
        }

        return candidate;        // majority element
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/majority-element/)