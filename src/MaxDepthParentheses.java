public class MaxDepthParentheses {
    public int maxDepth(String s) {
        int count = 0;
        int max = 0;
        int i = 0 ;
        while(i < s.length()) {
            if(s.charAt(i) == '(') count++;
            else if(s.charAt(i) == ')') {
                max = Math.max(max,count);
                count--;
            }
            i++;
        }
        return max;
    }
}
