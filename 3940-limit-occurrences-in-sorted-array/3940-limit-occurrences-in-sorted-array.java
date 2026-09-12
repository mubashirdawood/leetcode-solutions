import java.util.Arrays;

class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[0];
        }

        int writeIndex = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (writeIndex < k || nums[i] != nums[writeIndex - k]) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }

        return Arrays.copyOf(nums, writeIndex);
    }
}