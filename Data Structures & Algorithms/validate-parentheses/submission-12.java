class Solution {
    public boolean isValid(String s) {

        if(s.length() <= 1){
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char recentOpen = stack.pop();
                if(s.charAt(i) == ')' && recentOpen != '('){
                    return false;
                }
                else if(s.charAt(i) == ']' && recentOpen != '['){
                    return false;
                }
                else if(s.charAt(i) == '}' && recentOpen != '{'){
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
