public class MinSubArrayLength {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length == 0) return 0;
        int left = 0;
        int sum = 0;
        int count = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            while(sum >= target) {
                count = Math.min(count,i+1-left);
                sum -= nums[left];
                left++;
            }
        }
        if(count == Integer.MAX_VALUE) return 0;
        return count;


    }
}
