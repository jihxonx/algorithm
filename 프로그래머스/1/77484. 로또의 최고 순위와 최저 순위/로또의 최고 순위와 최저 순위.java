class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int matchCount = 0;
        
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                zeroCount++;
            }else{
                for(int j = 0; j < win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        matchCount++;
                        break;    
                    }
                    
                }
            }
        }
        int best = getRank(matchCount + zeroCount);
        int worst = getRank(matchCount);
    
        return new int[] {best, worst};
        
    }
    
     public int getRank(int count){
        int rank = 7 - count;
    
        if(rank > 6){
             return 6;
        }
    
        return rank;
    
    }

}