class Solution {
    public int reverse(int x) {
        long reversedNumber = 0;
        int temp = x;
        if(temp<0){
            temp*=-1;
        }
        while(temp>0){
            int digit = temp%10;
            reversedNumber = reversedNumber * 10 + digit;
            temp/=10;
        }
        if(x<0){
            reversedNumber*=-1;
        }
        if(reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE){
            return 0;
        } 
        return (int) reversedNumber;
    }
}
