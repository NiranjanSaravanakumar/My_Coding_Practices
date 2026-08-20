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
