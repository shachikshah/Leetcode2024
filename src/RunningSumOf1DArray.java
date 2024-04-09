public class RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        if(nums.length == 1) {
            return nums;
        }
        int[] sum = new int[nums.length];
        int prevCount = 0;
        for(int i=0; i < nums.length; i++){
            if(i == 0) {
                sum[i] = nums[i];
            }
            else {
                prevCount = sum[i-1] + nums[i];
                sum[i] = prevCount;
            }
        }
        return sum;
    }
}
