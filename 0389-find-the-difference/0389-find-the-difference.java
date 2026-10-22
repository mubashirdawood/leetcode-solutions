class Solution {
    public char findTheDifference(String s, String t) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            c ^= s.charAt(i);
            c ^= t.charAt(i);
        }
        c ^= t.charAt(t.length() - 1);
        return (char) c;
    }
}