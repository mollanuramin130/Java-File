import java.util.*;

public class Frog_Jump {
    public static int frogJump(int n, int heights[]) {

        int lost = 0;
        for (int i = 2; i < n; i++) {
            int step1 = Math.abs(heights[i - 2] - heights[i - 1]);
            int step2 = Math.abs(heights[i - 2] - heights[i]);
            lost += Math.min(step1, step2);
        }
        return lost;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] heights = {10, 30, 40, 20, 50};
        int result = frogJump(n, heights);
        System.out.println("Minimum lost height: " + result);
    }
}
