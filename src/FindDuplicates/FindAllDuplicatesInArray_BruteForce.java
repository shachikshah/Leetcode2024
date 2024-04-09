package FindDuplicates;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray_BruteForce {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    result.add(nums[i]);
                    break;
                }
            }
        }
        return result;
    }
}
