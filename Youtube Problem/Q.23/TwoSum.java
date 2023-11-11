import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 10, 5, 40};
        int target = 50;

        List<int[]> pairs = findUniquePairs(nums, target);
        if (pairs.isEmpty()) {
            System.out.println("No pairs found");
        } else {
            for (int[] pair : pairs) {
                System.out.println("Pair: [" + pair[0] + ", " + pair[1] + "]");
            }
        }
    }

    public static List<int[]> findUniquePairs(int[] nums, int target) {
        List<int[]> pairs = new ArrayList<>();
        HashMap<Integer, Integer> numMap = new HashMap<>();
    
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                // Check that the pair does not contain the same element twice
                pairs.add(new int[]{nums[i], complement});
                // Mark this element as used to avoid duplicate pairs
                //numMap.remove(complement);
            }
            numMap.put(nums[i], i);
        }
    
        return pairs;
    }
}
