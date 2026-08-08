class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       
        int[] count = new int[101];
        
        for (int num : nums) {
            count[num]++;
        }
        
        int cumulativeSum = 0;
        for (int i = 0; i <= 100; i++) {
            int freq = count[i];
            count[i] = cumulativeSum;
            cumulativeSum += freq;
        }
        
       
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = count[nums[i]];
        }
        
        return result;
    }
}