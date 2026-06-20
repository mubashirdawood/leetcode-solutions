class Solution {
    public boolean isPalindrome(int x) {

     if(x<0){
        return false;
     }
 
     int revers=0;
     int temp=x;
   
     while(temp>0){  
        revers= revers*10+(temp % 10);
        temp=temp/10;        
    }

    if(revers ==x){
        return true;
    }else{
        return false;
    }
   }
}