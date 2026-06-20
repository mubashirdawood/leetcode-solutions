class Solution {
    public int reverse(int x) {
    
        if (x == Integer.MIN_VALUE) {
            return 0; 
        }

        int temp = x;
        int rev = 0;
        
        if (x < 0) {
            temp = temp * (-1);
        }
        
        while (temp > 0) {
           
            if (rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }
        
        if (x < 0) {
            return -(rev);
        } else {
            return rev; 
        }
    }
}