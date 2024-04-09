public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        for (int[] person : accounts) {
            int count = 0;
            for(int wealth : person){
                count += wealth;
            }
            richest = Math.max(richest,count);
        }
        return richest;
    }
}
