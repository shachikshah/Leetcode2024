package TwoSums;

public class TwoSums2_2Pointers {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int [] result = new int [2];
        while(i < j) {
            int sum = numbers[i] + numbers[j];
            if(target == sum) {
                result[0] = i+1;
                result[1] = j+1;
                break;
            } else if( target > sum) i++;
            else j--;
        }
        return result;
    }
}
