class Solution {
    public int solution(int[] a, int[] b) {
        int sub = 0;
        
        for(int i = 0; i < a.length; i++){
            sub += a[i] * b[i];
        }
        
        return sub;
    }
}