class Solution:
    def minAdjacentSwaps(self, nums: list[int], a: int, b: int) -> int:
        mod = 10**9 +7
        ans = 0
        c1 = 0
        c2 = 0

        for n in nums:
            if n > b:
                c2 += 1
            elif n >= a:
                ans += c2
                c1 += 1
            else:
                ans += c1 + c2

        return ans % mod