class Solution {
    public boolean checkValidString(String s) {
        int mino=0,maxo=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                mino++;
                maxo++;
            }else if(c==')'){
                mino--;
                maxo--;
            }else{
                maxo++;
                mino--;
            }
            if(maxo<0){
                return false;
            }
            mino=Math.max(0,mino);
        }
        return mino==0;
    }
}