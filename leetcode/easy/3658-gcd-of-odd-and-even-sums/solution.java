class Solution {
    public int gcdOfOddEvenSums(int n) {
        return n*gcd(n, n+1);
        
    }
    public static int gcd(int a, int b){
        while(b != 0){
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
    }
}