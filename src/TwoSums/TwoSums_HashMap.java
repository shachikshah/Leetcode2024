package TwoSums;

import java.util.HashMap;
import java.util.Map;

public class TwoSums_HashMap {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int [2];
        for(int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                result[0] = i;
                result[1] = map.get(temp);
                break;
            }
            map.put(nums[i],i);

        }
        return result;
    }
}
