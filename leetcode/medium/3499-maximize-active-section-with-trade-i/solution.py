class Solution:
    def maxActiveSectionsAfterTrade(self, s: str) -> int:
        ones = s.count('1')

        t = "1" + s + "1"

        ch = []
        length = []

        i = 0
        while i < len(t):
            c = t[i]
            j = i
            while j < len(t) and t[j] == c:
                j += 1
            ch.append(c)
            length.append(j - i)
            i = j

        max_gain = 0

        for k in range(1, len(ch) - 1):
            if ch[k] == '1' and ch[k - 1] == '0' and ch[k + 1] == '0':
                gain = length[k - 1] + length[k + 1]
                max_gain = max(max_gain, gain)

        return ones + max_gain