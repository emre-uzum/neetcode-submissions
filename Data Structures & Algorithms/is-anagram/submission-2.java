class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> HM = new HashMap<>();

        for(char letter : s.toCharArray()){
            int currentLetterFreq = HM.getOrDefault(letter, 0);
            HM.put(letter, currentLetterFreq + 1);
        }


        for(char letter : t.toCharArray()){

            if(!HM.containsKey(letter) || HM.get(letter) <= 0){
                return false;
            }

            int currentLetterFreq = HM.get(letter);
            HM.put(letter, currentLetterFreq - 1);

    

        }

        return true;




    }
}
