package ThirdMax;

import java.util.Arrays;

public class ThirdMax_BruteForce2 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int num = nums[nums.length-1];
        int isThird = 1;
        int i = nums.length -1;
        while(isThird < 3 && i > 0){
            if(nums[i] != nums[i-1]){
                isThird ++;
                if(isThird == 3) return nums[i-1];
            }
            i--;
        }
        return num;
    }
}
