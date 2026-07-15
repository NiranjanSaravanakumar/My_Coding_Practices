class Solution {
    public int minJumps(int[] nums) {
        int n = nums.length;

        if (n == 1) return 0;
        if (nums[0] == 0) return -1;

        int l = 0, r = 0;
        int jumps = 0;

        while (r < n - 1) {

            int farthest = r;

            for (int i = l; i <= r; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }

            if (farthest == r)
                return -1;

            l = r + 1;
            r = farthest;
            jumps++;
        }

        return jumps;
    }
}