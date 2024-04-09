import java.util.Arrays;

public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        if (nums.length == 2) return Math.min(nums[0], nums[1]);
        Arrays.sort(nums);
        int i = 0;
        int sum = 0;
        while(i < nums.length) {
            sum += nums[i];
            i += 2;
        }
        return sum;
    }
}
