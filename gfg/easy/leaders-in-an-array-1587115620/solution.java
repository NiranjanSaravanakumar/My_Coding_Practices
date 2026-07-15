class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> res = new ArrayList<>();

        int n = arr.length;
        int curmax = arr[n - 1];

        res.add(curmax);

        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] >= curmax) {
                curmax = arr[i];
                res.add(curmax);
            }
        }

        Collections.reverse(res);

        return res;
    }
}