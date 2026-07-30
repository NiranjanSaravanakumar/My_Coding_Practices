class Solution:
    def minimumPushes(self, word: str) -> int:
        curpush = 1
        res = 0
        count = 0
        for c in word:
            if count > 0 and count % 8 == 0:
                curpush += 1
            res += curpush
            count += 1
        return res