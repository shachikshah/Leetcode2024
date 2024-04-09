package FindDisappereadNumbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDisappereadNumbers_HashMap {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int temp = 0;
        List<Integer> list= new ArrayList();
        for(int i = 0; i < nums.length; i++) {
            temp = 0;
            if(map.containsKey(nums[i])) temp = map.get(nums[i]);
            map.put(nums[i], temp++ );
        }
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(i+1)) {
                list.add(i+1);
            }
        }
        return list;
    }
}
