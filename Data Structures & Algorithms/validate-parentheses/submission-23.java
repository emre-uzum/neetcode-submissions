class Solution {
    public boolean isValid(String s) {
    
    ArrayList<Character> openBrackets = new ArrayList<>(List.of('[','{','('));
    Deque<Character> stack = new ArrayDeque<>();

    for(char bracket : s.toCharArray()){
        if(openBrackets.contains(bracket)){
            stack.push(bracket);
        }
        else{
            if(stack.isEmpty()){
                return false;
            }
            char lastOpen = stack.pop();

            if(bracket == ']' && lastOpen != '['
            || bracket == '}' && lastOpen != '{'
            || bracket == ')' && lastOpen != '('){
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
