class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Sort characters to create a unique canonical key
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = String.valueOf(charArray);

            // Add the original string to the corresponding key's list
            map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}