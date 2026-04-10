class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++){
            int count = countDivisor(i);
            
            if(count > limit){
                answer += power;
            }else{
                answer += count;
            }
        }
        return answer;
    }
    
    public int countDivisor(int num){
        int count = 0;
        
        for(int i = 1; i * i <= num; i++){
            if(num % i == 0){
                if(i * i == num){
                    count += 1;
                }else{
                    count += 2;
                }
            }
        }
        return count;        
    }
}