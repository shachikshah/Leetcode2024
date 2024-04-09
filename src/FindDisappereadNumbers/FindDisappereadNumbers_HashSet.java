package FindDisappereadNumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDisappereadNumbers_HashSet {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list= new ArrayList();
        for(int num : nums) {
            set.add(num);
        }
        for(int i = 0; i < nums.length; i++) {
            if(!set.contains(i+1)) {
                list.add(i+1);
            }
        }
        return list;
    }
}
