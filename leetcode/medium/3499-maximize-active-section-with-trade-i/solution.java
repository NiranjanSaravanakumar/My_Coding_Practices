class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;
        for (char c : s.toCharArray())
            if (c == '1') ones++;

        String t = "1" + s + "1";
        int n = t.length();

        int maxGain = 0;
        int i = 0;

        while (i < n) {
            char prevChar = t.charAt(i);
            int prevLen = 0;
            while (i < n && t.charAt(i) == prevChar) {
                prevLen++;
                i++;
            }

            if (i >= n) break;

            char midChar = t.charAt(i);
            int midLen = 0;
            while (i < n && t.charAt(i) == midChar) {
                midLen++;
                i++;
            }

            if (i >= n) break;

            char nextChar = t.charAt(i);
            int nextLen = 0;
            while (i < n && t.charAt(i) == nextChar) {
                nextLen++;
                i++;
            }

            if (prevChar == '0' && midChar == '1' && nextChar == '0') {
                maxGain = Math.max(maxGain, prevLen + nextLen);
            }

            i -= nextLen;
        }

        return ones + maxGain;
    }
}