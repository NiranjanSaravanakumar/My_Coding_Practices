class Solution:
    def largestInteger(self, nums: List[int], k: int) -> int:
        count = [0] * 51

        # Generate every subarray of size k
        for i in range(len(nums) - k + 1):

            seen = [False] * 51

            # Current subarray: nums[i ... i + k - 1]
            for j in range(i, i + k):
                seen[nums[j]] = True

            # Count each number only once per subarray
            for num in range(51):
                if seen[num]:
                    count[num] += 1

        # Find the largest number appearing in exactly one subarray
        for num in range(50, -1, -1):
            if count[num] == 1:
                return num

        return -1