class Solution {
    
    public long solution(long n) {
       char[] digits = String.valueOf(n).toCharArray();
        
        for(int i = 0; i < digits.length - 1; i++){
            for(int j = i + 1; j < digits.length; j++){
                if(digits[i] < digits[j] ){
                    char temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }
        return Long.parseLong(new String(digits));
    }
}