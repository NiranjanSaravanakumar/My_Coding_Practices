class Solution:
    def maximumValue(self, n: int, s: int, m: int) -> int:
        if n == 1:
            return s
        peeks = n // 2

        return s + m + (peeks - 1) *(m-1)