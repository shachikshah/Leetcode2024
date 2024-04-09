package FindDuplicates;

public class FindDuplicates_Array {
    public int findDuplicate(int[] nums) {
        boolean[] vis = new boolean[nums.length];
        for(int i:nums){
            if(vis[i] == false) vis[i] = true;
            else return i;
        }
        return -1;
    }
}
