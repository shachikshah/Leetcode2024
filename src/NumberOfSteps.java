public class NumberOfSteps {
    public int numberOfSteps(int num) {
        int step = 0;
        while(num != 0) {
            if(num%2 == 0) {
                num = num/2;
            } else {
                num--;
            }
            step++;
        }
        return step;
    }
}