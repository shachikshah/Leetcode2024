package ThirdMax;

import java.util.Arrays;

public class ThirdMax_BruteForce {
    public int thirdMax(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        if(nums.length == 3) {
            if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
                return Math.max(nums[0], Math.max(nums[1],nums[2]));
            }
            return  Math.min(nums[0], Math.min(nums[1],nums[2]));
        }
        Arrays.sort(nums);
        int i = nums.length-1;
        int temp = 0;
        int max = 0;
        while(i > 0) {
            if(nums[i] == nums[i-1]) i--;
            else {
                if(temp < 2) {
                    temp++;
                    max = nums[i-1];
                    System.out.println(max);
                    i--;
                } else{
                    break;
                }
            }
        }
        if(temp != 2) {
            return nums[nums.length-1];
        }
        return max;
    }
}
