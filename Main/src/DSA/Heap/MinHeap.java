package DSA.Heap;

import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(9);
        minHeap.add(25);
        minHeap.add(65);
//        System.out.println(minHeap.peek());
        System.out.println(minHeap.poll());
        System.out.println(minHeap);
        System.out.println("Min Heap root element: " + minHeap.peek());  // Output: 10

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll()+" ");  // Removes and prints elements in sorted order
        }
        System.out.println();
        System.out.println(minHeap);

    }
}
