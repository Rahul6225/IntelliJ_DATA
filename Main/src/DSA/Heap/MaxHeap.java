package DSA.Heap;
import java.util.*;
public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(15);

        System.out.println("Max Heap root element: " + maxHeap.peek());  // Output: 20

        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());  // Removes and prints elements in descending order
        }
    }
}