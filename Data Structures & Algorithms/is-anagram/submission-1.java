class Solution {
    public boolean isAnagram(String s, String t) {


        /*
        PLAN
        --Check if both lengths add up to eachother

        --Go through each letter in s
        --Add it to a hashmap and update frequencies

        --Go through each letter in t
        --Check if HM contains letter and or if freq is <=1
            -- if cant, return false
        --reduce count by 1 if applicable

        return true

        */

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> HM = new HashMap<>();
        for(char letter : s.toCharArray()){
            HM.put(letter, HM.getOrDefault(letter, 0) + 1);
        }

        System.out.println(HM);

        for(Character letter : t.toCharArray()){
            if(!HM.containsKey(letter) || HM.get(letter) <= 0){
                return false;
            }

            int currentFreq = HM.get(letter);

            HM.put(letter, currentFreq - 1);
        }

        return true;


    }
}
