class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n ==1)
            return s;
        long peeks = n/2;
        return s + m + (peeks -1)*(m-1);
    }
}