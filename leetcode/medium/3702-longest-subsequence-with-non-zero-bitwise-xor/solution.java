class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int totalXor = 0; 
        for (int num : nums) {
            totalXor ^= num; // compute XOR of all elements
        }
        // Case 1: all zeros
        boolean hasAllZeors = true;
        for (int num : nums) {
            if (num != 0) {
                hasAllZeors = false;
                break;
            }
        }
        if (hasAllZeors) return 0;
        // Case 2: XOR of all numbers is non-zero
        if (totalXor != 0) {
            return n;
        }
        // Case 3: XOR of all numbers is zero
        return n - 1;
    }
}