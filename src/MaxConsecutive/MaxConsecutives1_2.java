package MaxConsecutive;

public class MaxConsecutives1_2 {
    public int findMaxConsecutiveOnes2(int[] nums) {
        boolean flag = true;
        int temp = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && flag ) {
                flag = false;
                nums[i] = 1;
                temp++;
            } else if (nums[i] == 0 && !flag) {
                max = Math.max(max, temp);
                temp = 0;
                flag = true;
            }
            else if( nums[i] == 1 ) {
                temp++;
            }
        }
        return Math.max(max,temp);
    }
}
