import java.util.Arrays;

public class HeightChecker_BruteForce {
    public int heightChecker(int[] heights) {
//        int [] expected = new int[heights.length];
        int [] expected = heights.clone();
        for(int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        int i = 0;
        int temp = 0;
        while(i < heights.length) {
            if(heights[i] != expected[i]) {
                temp++;
            }
            i++;
        }
        return temp;
    }
}
