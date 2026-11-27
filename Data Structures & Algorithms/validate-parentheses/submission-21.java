class Solution {
    public boolean isValid(String s) {

        ArrayList<Character> openBrackets = new ArrayList<>(List.of('(','[','{'));
        Deque<Character> stack = new ArrayDeque<>();

        for(char currentBracket : s.toCharArray()){
            if(openBrackets.contains(currentBracket)){
                stack.push(currentBracket);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }

                char lastOpen = stack.pop();

                if(currentBracket == ']' && lastOpen != '['
                || currentBracket == '}' && lastOpen != '{'
                || currentBracket == ')' && lastOpen != '('){
                    return false;
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }

        return false;
        
    }
}
