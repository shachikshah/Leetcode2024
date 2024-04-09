package LongestCommonPrefix;

import java.util.Arrays;

public class LongestCommonPrefic_Lexicographically {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i=0,j=0;
        int count=0;
        String first=strs[0], last=strs[strs.length-1];
        while(i<first.length() && j<last.length()){
            if(first.charAt(i)==last.charAt(j)){
                count++;
                i++;
                j++;
            }
            else{
                break;
            }
        }
        if(count==0){
            return "";
        }
        return first.substring(0,count);
    }
}
