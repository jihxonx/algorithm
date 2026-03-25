class Solution {
    public int solution(int a, int b, int n) {

        int answer = 0;
        
        while(n >= a){
            int change = n / a;
            answer += change * b;
            n = (n % a) + (change * b);
        }
        
        return answer;
    }
}