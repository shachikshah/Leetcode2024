package CheckIfNandDoubleExists;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNandDoubleExists_Set {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> map = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            if(map.contains(arr[i]*2) || (map.contains(arr[i]/2) && arr[i]%2==0)) {
                return true;
            }
            map.add(arr[i]);
        }
        return false;
    }}
