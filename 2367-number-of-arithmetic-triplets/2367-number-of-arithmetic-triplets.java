class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num - diff) && seen.contains(num - 2 * diff)) {
                count++;
            }
            seen.add(num);
        }
        
        return count;
    }
}