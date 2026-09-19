class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char ch:s1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        char l= 0;
        for(int r =0;r<s2.length();r++){
            char ch = s2.charAt(r);
            map2.put(ch,map2.getOrDefault(ch,0)+1);

            
            if(r-l+1>s1.length()){
                char remove = s2.charAt(l);
                map2.put(remove,map2.get(remove)-1);
                if(map2.get(remove)==0){
                    map2.remove(remove);
                }
                l++;
            }
            if(map1.equals(map2)){
                return true;
            }
        
        }
        return false;
    }
}
