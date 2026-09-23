class Solution:
    def minOperations(self, nums: list[int], x: int) -> int:
        n = len(nums)

        total_sum = sum(nums)
        target = total_sum - x

        # We need to keep a subarray with sum = target
        if target < 0:
            return -1

        left = 0
        window_sum = 0
        max_length = -1

        for right in range(n):
            window_sum += nums[right]

            while left <= right and window_sum > target:
                window_sum -= nums[left]
                left += 1

            if window_sum == target:
                max_length = max(max_length, right - left + 1)

        if max_length == -1:
            return -1

        return n - max_length