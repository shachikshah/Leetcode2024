package RotateArray;

public class RotateArray_Optimal {
    public void rotate(int[] nums, int k) {
        int n = nums.length-1;
        if(k>nums.length){
            k = k%nums.length;
        }
        reverse(nums,0,n);
        reverse(nums,0,k-1);
        reverse(nums,k,n);
    }
    public void reverse(int[] nums, int start, int end) {
        while(start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
