class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long ans = 0;
        long c2 = 0;
        long c1 = 0;
        for(int num  : nums){
            if(num > b){
                c2 ++;
            }
            else if (num >= a){
                ans += c2;
                c1++;
            }
            else{
                ans += c1 + c2;
            }
        }
        return (int) (ans % 1000000007);
    }
}