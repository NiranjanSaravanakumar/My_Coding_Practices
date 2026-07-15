class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

        int n = arr.length;
        int[] rightMax = new int[n];

        rightMax[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] == rightMax[i]) {
                res.add(arr[i]);
            }
        }

        return res;
    }
}