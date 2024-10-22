package DSA.OOPS.EndTerm;
import java.util.*;

public class Curator_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for(int i=0;i<n;i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int target = sc.nextInt();
        //binary Search

        int s=0;
        int e=n-1;
        boolean found =false;

        while (s <= e) {  // Use <= to include the possibility of s == e
            int mid = s + (e - s) / 2;

            if (list.get(mid) < target) {  // Compare with target
                s = mid + 1;
            } else if (list.get(mid) > target) {  // Compare with target
                e = mid - 1;
            } else {  // Element found
                System.out.println("Target found at index: " + mid);
                found = true;
                break;  // Exit loop once target is found
            }
        }
        // Step 6: If target is not found
        if (!found) {
            System.out.println("Target not found.");
        }
    }
}
