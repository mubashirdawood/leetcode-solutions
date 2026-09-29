class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charCounts = new int[26];
        for (char c : chars.toCharArray()) {
            charCounts[c - 'a']++;
        }

        int totalLength = 0;

        for (String word : words) {
            int[] wordCounts = new int[26];
            boolean canForm = true;

            for (char c : word.toCharArray()) {
                wordCounts[c - 'a']++;
                if (wordCounts[c - 'a'] > charCounts[c - 'a']) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                totalLength += word.length();
            }
        }

        return totalLength;
    }
}