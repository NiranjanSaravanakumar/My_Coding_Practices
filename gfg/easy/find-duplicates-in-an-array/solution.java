class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int a:arr){
            if(set.contains(a)){
                res.add(a);
            }
            set.add(a);
        }
        return res;
    }
}