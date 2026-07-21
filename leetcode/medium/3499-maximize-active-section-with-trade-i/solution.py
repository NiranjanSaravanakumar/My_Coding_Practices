class Solution:
    def maxActiveSectionsAfterTrade(self, s: str) -> int:
        ones = s.count('1')

        t = '1' + s + '1'

        ch = []
        length = []

        i = 0
        while i < len(t):
            j = i
            while j < len(t) and t[j] == t[i]:
                j += 1
            ch.append(t[i])
            length.append(j - i)
            i = j

        maxGain = 0

        for k in range(1, len(ch) - 1):
            if ch[k] == '1' and ch[k-1] == '0' and ch[k+1] == '0':
                maxGain = max(maxGain, length[k-1] + length[k+1])

        return ones + maxGain