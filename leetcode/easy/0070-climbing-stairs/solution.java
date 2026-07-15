class Solution {
    public int climbStairs(int n) {
        int a = 0,b=1,res = 0;

        for(int i=0;i<n;i++){
            res = a + b;
            a = b;
            b =res;
        }
        return res;
    }
}