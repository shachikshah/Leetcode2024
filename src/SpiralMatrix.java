import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int down = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while (left <= right && top <= down) {
            int i = left;
            while(i <= right) {
                result.add(matrix[top][i]);
                i++;
            }
            top++;
            if(top > down || left > right) break;
            int j = top;
            while(j <= down) {
                result.add(matrix[j][right]);
                j++;
            }
            right--;
            if(top > down || left > right) break;
            i =  right;
            while (i >= left) {
                result.add(matrix[down][i]);
                i--;
            }
            down--;
            if(top > down || left > right) break;
            j = down;
            while(j >= top) {
                result.add(matrix[j][left]);
                j--;
            }
            left++;
            if(top > down || left > right) break;
        }
        return result;
    }
}
