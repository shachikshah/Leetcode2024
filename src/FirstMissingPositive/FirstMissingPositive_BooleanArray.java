package FirstMissingPositive;

public class FirstMissingPositive_BooleanArray {
    public int firstMissingPositive(int[] nums) {
        boolean [] seen = new boolean[nums.length + 1];
        for(int num : nums) {
            if(num > 0 && num <= nums.length) seen[num] = true;
        }
        for(int j = 1; j <= nums.length; j++) {
            if(!seen[j]) return j;
        }
        return nums.length+1;
    }
}
