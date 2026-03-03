class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        
        for(int i = 0; i <= 9; i++){
            boolean exists = false;
            
            for(int num : numbers){
                if(num == i){
                    exists = true;
                    break;
                }
            }
            if(!exists){
                sum += i;
            }
        }
        return sum;
    }
}