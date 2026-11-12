class Solution {
    public boolean isAnagram(String s, String t) {

        if(s == null || t == null){
            return false;
        }

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> HM = new HashMap<>();


        //add letters in s and how much they appear into hashmap
        for(char c : s.toCharArray()){
            
            int currentFreq = HM.getOrDefault(c, 0);
            HM.put(c, currentFreq + 1);

        }

        //Go through each letter in t and reduce its freq by one
        for(char c : t.toCharArray()){

            if(!HM.containsKey(c) || HM.get(c) <= 0){
                return false;
            }

            HM.put(c, HM.get(c) - 1);
        }

        return true;

    }
}
