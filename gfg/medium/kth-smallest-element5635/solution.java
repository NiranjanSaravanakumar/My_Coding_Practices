import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int kthSmallest(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();   // Remove the largest
            }
        }

        return pq.peek();
    }
}