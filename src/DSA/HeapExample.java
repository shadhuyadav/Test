package DSA;

import java.util.PriorityQueue;

public class HeapExample {
    //min-heap: Retrieve the k largest elements in an array using a min-heap
    public static int[] kLargestElements(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) minHeap.poll();
        }
            int[] result = new int[k];
            for (int i = 0; i < k; i++) result[i] = minHeap.poll();
            return result;
        }
    public static void main(String args[]){
        int nums[]={3,2,1,5,6,4};
        int k=2;
        int[] result=kLargestElements(nums,k);
        System.out.println("K largest elements: ");
        for(int num:result){
            System.out.print(num+"");
        }
    }
}
