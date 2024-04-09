package CheckIfNandDoubleExists;

public class CheckIfNandDoubleExists_BruteForce {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for( int j = i+1; j < arr.length; j++) {
                if(arr[i]*2==arr[j] || (arr[i]/2 == arr[j] && arr[i]%2 == 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
