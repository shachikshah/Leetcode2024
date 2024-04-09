public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0) return new int [] {};
        if(mat[0].length == 0) return new int [] {};
        int m = mat.length;
        int n = mat[0].length;
        int [] result = new int[m*n];
        int x = 0;
        int y = 0;
        int k = 0;
        while(k < result.length) {
            result[k] = mat[x][y];
            k++;
            boolean isEven = (x+y)%2 == 0;
            if(isEven) {
                if(y < n-1 && x > 0) {
                    y++;
                    x--;
                } else if( y < n-1) {
                    y++;
                }
                else {
                    x++;
                }
            } else {
                if(x<m-1 && y>0) {
                    x++;
                    y--;
                } else if(x < m-1) {
                    x++;
                } else {
                    y++;
                }
            }
        }
        return result;
    }
}
