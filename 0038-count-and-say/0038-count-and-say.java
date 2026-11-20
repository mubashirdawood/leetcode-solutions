class Solution {
    public String countAndSay(int n) {
        String current = "1";

        for (int step = 1; step < n; step++) {
            StringBuilder next = new StringBuilder();
            int i = 0;
            int len = current.length();

            while (i < len) {
                char digit = current.charAt(i);
                int count = 0;

                // Count consecutive identical characters
                while (i < len && current.charAt(i) == digit) {
                    count++;
                    i++;
                }

                // Append "<count><digit>"
                next.append(count).append(digit);
            }

            current = next.toString();
        }

        return current;
    }
}