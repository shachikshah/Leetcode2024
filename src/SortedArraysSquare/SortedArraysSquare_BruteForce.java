package SortedArraysSquare;

public class SortedArraysSquare_BruteForce {
    public int[] sortedSquares(int[] nums) {
        int square [] = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        while(i<=j){
            if(Math.abs(nums[i])<Math.abs(nums[j])) {
                square[k] = nums[j]*nums[j];
                j--;
            } else {
                square[k] = nums[i]*nums[i];
                i++;
            }
            k--;
        }

        return square;
    }
}
