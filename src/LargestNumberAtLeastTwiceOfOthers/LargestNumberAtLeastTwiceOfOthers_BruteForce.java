package LargestNumberAtLeastTwiceOfOthers;

public class LargestNumberAtLeastTwiceOfOthers_BruteForce {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int max2 = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            if(max < nums[i]) {
                max2 = max;
                max = nums[i];
                maxIndex = i;
            }
            else if(max2 < nums[i]) {
                max2 = nums[i];
            }
        }
        return max >= max2*2 ? maxIndex : -1;
    }
}
