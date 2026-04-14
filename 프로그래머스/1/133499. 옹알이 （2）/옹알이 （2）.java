class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] words = {"aya","ye","woo","ma"};
        
        for(String b : babbling){
            int idx = 0;
            String prev = "";
            boolean possible = true;
            
            while(idx < b.length()){
                boolean matched = false;
                
                for(String word : words){
                    if(b.startsWith(word,idx) && !prev.equals(word)){
                        idx += word.length();
                        prev = word;
                        matched = true;
                        break;
                    }
                }
                
                if(!matched){
                    possible = false;
                    break;
                }
            }
            
            if(possible){
                answer++;
            }
        }
        return answer;
    }
}