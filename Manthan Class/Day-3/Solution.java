import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();

        if (k >= 1 && k <= arr.size()) {
            // Sort the ArrayList in ascending order
            Collections.sort(arr);

            // Add the kth smallest element to the result
            result.add(arr.get(k - 1));

            // Add the kth largest element to the result
            result.add(arr.get(arr.size() - k));
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(4);
        arr.add(2);
        arr.add(5);
        int k = 2;

        ArrayList<Integer> result = kthSmallLarge(arr, k);

        if (result.size() == 2) {
            System.out.println("Kth Smallest: " + result.get(0));
            System.out.println("Kth Largest: " + result.get(1));
        } else {
            System.out.println("Invalid value of k.");
        }
    }
}
