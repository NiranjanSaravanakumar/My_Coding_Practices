class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        int n = arr.length;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            while (sum > target) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                return new ArrayList<>(Arrays.asList(left + 1, right + 1));
            }
        }

        return new ArrayList<>(Arrays.asList(-1));
    }
}