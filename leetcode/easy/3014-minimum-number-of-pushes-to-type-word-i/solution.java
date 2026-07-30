class Solution {
    public int minimumPushes(String word) {
        int curpush =1;
        int res = 0;
        int count =0;
        for(char c:word.toCharArray()){
            if(count>0 && count%8==0){
                curpush++;
            }
            res += curpush;
            count++;
        }
        return res;
    }
}