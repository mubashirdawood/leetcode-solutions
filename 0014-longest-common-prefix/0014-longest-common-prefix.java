import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String second = strs[strs.length - 1];

        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            
           
            if (first.charAt(i) != second.charAt(i)) {
                return res.toString(); 
            }
            
           
            res.append(first.charAt(i));
        }
        
        return res.toString();
    }
}