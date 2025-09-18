package Arrays;

import java.util.HashMap;
import java.util.PriorityQueue;

public class topKFrequentElements {
    public static int[] topKFrequentElements(int[] nums, int k) {
        // Step 1: Count frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a Min-Heap to keep top k elements
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int key : map.keySet()) {
            heap.add(key);
            if (heap.size() > k) {
                heap.poll(); // Remove the least frequent element
            }
        }

        // Step 3: Extract elements from the heap
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }

        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int k = 2;
        int ans[] = topKFrequentElements(nums, k);
        System.out.println(ans);
    }
}
