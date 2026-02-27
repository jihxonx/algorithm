class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == ' '){
                sb.append(c);
                pos = 0;
            }else{
                if( pos % 2 == 0){
                    sb.append(Character.toUpperCase(c));
                }else{
                    sb.append(Character.toLowerCase(c));
                }
                pos++;
            }
            
        }
        
        
        return sb.toString();
    }
}