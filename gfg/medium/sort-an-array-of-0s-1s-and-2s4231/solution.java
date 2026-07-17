class Solution {
    public void sort012(int[] arr) {
        int n = arr.length;
        int l = 0 , m =0 , h =n-1;
        
        while(m<=h){
            if(arr[m] == 0){
                int t = arr[m];
                arr[m] = arr[l];
                arr[l] = t;
                m++;
                l++;
            }
            else if (arr[m] == 1){
                m++;
            }
            else{
                int t = arr[m];
                arr[m] = arr[h];
                arr[h] = t;
                h--;
            }
        }
        
    }
}