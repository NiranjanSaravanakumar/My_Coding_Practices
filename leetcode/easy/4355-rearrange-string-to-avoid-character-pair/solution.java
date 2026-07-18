class Solution {
    public String rearrangeString(String s, char x, char y) {
        int n = s.length();
        int [] fre = new int [26];

        for(char c:s.toCharArray()){
            fre[c - 'a']++;
        }

        String ans = "";

        while(fre[ y - 'a']-- > 0){
            ans  += y;
        }

        for(char c = 'a';c<='z';c++){
            if(c == x || c == y){
                continue;
            }
            while(fre[c - 'a']-- >0){
                ans += c;
            }
        }
        while(fre[x - 'a']-- > 0){
            ans += x;
        }

        return ans;
    }
}