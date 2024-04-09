package TwoSums;

import java.util.HashMap;
import java.util.Map;

public class TwoSums2_HashMap {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int [2];
        for(int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                result[1] = i+1;
                result[0] = map.get(temp);
                break;
            }
            map.put(nums[i],i+1);

        }
        return result;
    }
}
