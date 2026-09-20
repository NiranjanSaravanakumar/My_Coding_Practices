class Solution:
    def reverseDegree(self, s: str) -> int:
        total = 0
        
        for i, c in enumerate(s, 1):
            d = 26 - (ord(c) - ord('a'))
            total += d * i
        
        return total