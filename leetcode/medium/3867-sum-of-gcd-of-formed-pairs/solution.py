class Solution:
    def gcdSum(self, nums: list[int]) -> int:
        n = len(nums)
        prefixGcd = [0] * n

        mx = 0
        for i in range(n):
            mx = max(mx, nums[i])
            prefixGcd[i] = gcd(nums[i], mx)

        prefixGcd.sort()

        ans = 0
        i, j = 0, n - 1

        while i < j:
            ans += gcd(prefixGcd[i], prefixGcd[j])
            i += 1
            j -= 1

        return ans