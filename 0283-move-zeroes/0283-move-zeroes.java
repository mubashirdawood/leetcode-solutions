class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length; 
        int back = 0;
        int front = 0;
        
        while (front < n) {
            if (nums[front] != 0) {
                nums[back] = nums[front];
                back++;
            }
            front++;
        }

        while (back < n) {
            nums[back] = 0;
            back++;
        }
    }
}
