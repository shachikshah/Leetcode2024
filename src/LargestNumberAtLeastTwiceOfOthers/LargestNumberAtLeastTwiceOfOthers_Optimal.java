package LargestNumberAtLeastTwiceOfOthers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestNumberAtLeastTwiceOfOthers_Optimal {
    public int dominantIndex(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        int n = nums.length-1;
        System.out.println(nums[0] +" "+ nums[1]);
        if(nums[n] >= 2*nums[n-1]) return map.get(nums[n]);
        return -1;
    }
}
