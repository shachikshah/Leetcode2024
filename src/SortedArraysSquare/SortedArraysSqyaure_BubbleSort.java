package SortedArraysSquare;

public class SortedArraysSqyaure_BubbleSort {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        int[] square = new int[nums.length];
        for(int i = 0; i < nums.length-1; i++) {
            int temp = i;
            for(int j = i+1; j < nums.length; j++){
                if(nums[j]<nums[temp]) {
                    temp = j;
                }
            }
            int temp_val = nums[temp];
            nums[temp] = nums[i];
            nums[i] = temp_val;
        }
        return nums;
    }
}
