class Solution {
    public int characterReplacement(String s, int k) {
        int l =0;
        int maxlen = 0;
        int maxfre = 0;
        int count[] = new int[26];

        for(int r =0;r<s.length();r++){
            count[s.charAt(r) - 'A']++;
            maxfre = Math.max(maxfre,count[s.charAt(r)-'A']);

            while((r-l+1) - maxfre>k){
                count[s.charAt(l)-'A']--;
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
        }
        return maxlen; 
        
    }
}
