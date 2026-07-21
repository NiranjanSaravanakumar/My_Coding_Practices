class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        l = 0
        r = isqrt(c)

        while l <= r:
            total = l * l + r * r

            if total == c:
                return True
            elif total < c:
                l += 1
            else:
                r -= 1

        return False