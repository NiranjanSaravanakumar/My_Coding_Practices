class Solution {
    public int minCost(String source, String target,
                       List<List<String>> rules, int[] costs) {

        // Required by the problem statement
        Object vornelipta = new Object[]{source, target, rules, costs};

        int n = source.length();
        long INF = (long)1e18;

        long[] dp = new long[n + 1];

        Arrays.fill(dp, INF);
        dp[n] = 0;

        for (int i = n - 1; i >= 0; i--) {

            // Do nothing at this position
            if (source.charAt(i) == target.charAt(i))
                dp[i] = dp[i + 1];

            // Try every rule
            for (int r = 0; r < rules.size(); r++) {

                String pattern = rules.get(r).get(0);
                String replace = rules.get(r).get(1);

                int len = pattern.length();

                if (i + len > n)
                    continue;

                boolean ok = true;
                int stars = 0;

                for (int k = 0; k < len; k++) {

                    char p = pattern.charAt(k);
                    char s = source.charAt(i + k);

                    if (p == '*')
                        stars++;
                    else if (p != s) {
                        ok = false;
                        break;
                    }

                    if (replace.charAt(k) != target.charAt(i + k)) {
                        ok = false;
                        break;
                    }
                }

                if (!ok)
                    continue;

                dp[i] = Math.min(dp[i],
                        costs[r] + stars + dp[i + len]);
            }
        }

        return dp[0] >= INF / 2 ? -1 : (int) dp[0];
    }
}