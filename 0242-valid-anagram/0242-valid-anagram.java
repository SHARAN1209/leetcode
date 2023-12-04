class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        int[] englishLetters = new int[26];
        for(int i=0;i<s.length();i++){
            englishLetters[s.charAt(i)-'a']++;
            englishLetters[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(englishLetters[i]!=0) return false;
        }
        return true;
    }
}