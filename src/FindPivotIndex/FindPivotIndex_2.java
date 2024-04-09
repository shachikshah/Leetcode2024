package FindPivotIndex;

public class FindPivotIndex_2 {
    public int pivotIndex(int[] nums) {
        int sumR = 0;
        int sumL = 0;
        int [] numsR = new int [nums.length];
        if(nums.length == 1) return 0;
        for(int i = nums.length-1; i >= 0; i--) {
            sumR += nums[i];
            numsR[i] = sumR;
        }
        if(numsR[0]-nums[0] == 0) return 0;
        for(int i = 1; i < nums.length; i++) {
            sumL += nums[i-1];
            if(sumL == numsR[i] - nums[i]) return i;
        }
        return -1;
    }
}
