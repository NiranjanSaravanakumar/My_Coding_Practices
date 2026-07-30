class Solution:
    def minimumPushes(self, word: str) -> int:
        res = 0
        for i in range(len(word)):
            # Integer division by 8 tells us how many times to increment
            res += (i // 8) + 1
        return res