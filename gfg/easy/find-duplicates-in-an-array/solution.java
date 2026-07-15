class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {

        Arrays.sort(arr);

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {

                if (res.isEmpty() || res.get(res.size() - 1) != arr[i])
                    res.add(arr[i]);
            }
        }

        return res;
    }
}