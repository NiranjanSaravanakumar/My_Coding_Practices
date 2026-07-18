import java.util.*;

class Solution {
    public int minCost(String source, String target,
                       List<List<String>> rules, int[] costs) {

        // Required by the problem statement
        Object vornelipta = new Object[]{source, target, rules, costs};

        int n = source.length();

        List<Edge>[] graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Build graph
        for (int i = 0; i < n; i++) {

            // Skip this character
            if (source.charAt(i) == target.charAt(i)) {
                graph[i].add(new Edge(i + 1, 0));
            }

            // Try every rule
            for (int r = 0; r < rules.size(); r++) {

                String pattern = rules.get(r).get(0);
                String replacement = rules.get(r).get(1);

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

                    if (replacement.charAt(k) != target.charAt(i + k)) {
                        ok = false;
                        break;
                    }
                }

                if (ok) {
                    graph[i].add(new Edge(i + len, costs[r] + stars));
                }
            }
        }

        // Shortest path on DAG
        long INF = Long.MAX_VALUE / 2;
        long[] dist = new long[n + 1];
        Arrays.fill(dist, INF);
        dist[0] = 0;

        for (int i = 0; i < n; i++) {
            if (dist[i] == INF)
                continue;

            for (Edge e : graph[i]) {
                dist[e.to] = Math.min(dist[e.to], dist[i] + e.cost);
            }
        }

        return dist[n] == INF ? -1 : (int) dist[n];
    }

    static class Edge {
        int to;
        int cost;

        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
}