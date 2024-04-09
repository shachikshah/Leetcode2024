package RotateArray;

public class RotateArray_BruteForce {
    public void rotate(int[] nums, int k) {
        int i = 0;
        int n = nums.length;
        int [] s = new int [n];
        if(k>n){
            k = k%n;
        }
        while(i < k && k <= n) {
            s[i] = nums[n-k+i];
            i++;
        }
        while(i < n) {
            s[i] = nums[i-k];
            i++;
        }
        for(int j = 0; j < n; j++) {
            nums[j] = s[j];
        }
    }
}
