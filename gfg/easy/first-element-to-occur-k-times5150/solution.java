class Solution {
    public int firstElementKTime(int[] arr, int k) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.get(arr[i]).add(i);
            }
            else{
            ArrayList<Integer> cur = new ArrayList<>();
            cur.add(i);
            map.put(arr[i],cur);
            }
            set.add(arr[i]);
        }
        int res = -1;
        int ci = Integer.MAX_VALUE;
        for(int x : set){
            if(map.get(x).size() >= k){
                if(ci > map.get(x).get(k-1) ){
                    res = x;
                    ci = map.get(x).get(k-1);
                }
            }
        }
        return res;
    }
}