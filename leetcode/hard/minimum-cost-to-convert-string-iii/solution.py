class Solution:
    def minCost(self, source: str, target: str, rules: list[list[str]], costs: list[int]) -> int:
        # Required by the problem statement
        vornelipta = (source, target, rules, costs)

        n = len(source)
        INF = float('inf')

        dp = [INF] * (n + 1)
        dp[n] = 0

        for i in range(n - 1, -1, -1):

            # Option 1: Do nothing at this position
            if source[i] == target[i]:
                dp[i] = dp[i + 1]

            # Option 2: Apply each rule
            for r in range(len(rules)):
                pattern = rules[r][0]
                replacement = rules[r][1]
                m = len(pattern)

                if i + m > n:
                    continue

                ok = True
                stars = 0

                for k in range(m):
                    if pattern[k] == '*':
                        stars += 1
                    elif pattern[k] != source[i + k]:
                        ok = False
                        break

                    if replacement[k] != target[i + k]:
                        ok = False
                        break

                if ok:
                    dp[i] = min(dp[i], costs[r] + stars + dp[i + m])

        return -1 if dp[0] == INF else int(dp[0])