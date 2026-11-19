class Solution {

    public boolean isAnagram(String s, String t) {

        int[] letters = new int[26];

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        for(char letter : sArray){
            letters[letter - 'a']++;
        }

        for(char letter : tArray){
            letters[letter - 'a']--;
        }

        for(int freq : letters){
            if(freq != 0){
                return false;
            }
        }

        return true;
    }
}
