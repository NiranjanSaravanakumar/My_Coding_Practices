class Solution {
    public String longestPalindrome(String s) {

        if (s.length() <= 1) return s;

        String result = "";

        for (int i = 0; i < s.length(); i++) {

            // odd length
            int l = i, r = i;
            while (l >= 0 && r < s.length() &&
                   s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            String odd = s.substring(l + 1, r);
            if (odd.length() > result.length()) result = odd;

            // even length
            l = i; r = i + 1;
            while (l >= 0 && r < s.length() &&
                   s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            String even = s.substring(l + 1, r);
            if (even.length() > result.length()) result = even;
        }

        return result;
    }
}