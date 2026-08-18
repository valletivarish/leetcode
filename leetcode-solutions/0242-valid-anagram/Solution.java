class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] cache = new int[26];
        for(int i=0; i<s.length(); i++){
            cache[s.charAt(i)-'a']++;
            cache[t.charAt(i)-'a']--;
        }
        for(int i:cache){
            if(i>0){
                return false;
            }
        }
        return true;
    }
}
