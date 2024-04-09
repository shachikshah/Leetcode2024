package FirstMissingPositive;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive_Set {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) set.add(nums[i]);
        }
        int j = 1;
        int t = 1;
        while(j <= nums.length) {
            if(!set.contains(j)) return j;
            j++;
        }
        return j;
    }
}
