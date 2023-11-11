class Solution {
    public boolean isValid(String s) {

        //Check for valid string
        if(s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }

                char newStack = stack.pop();
        
                if ((ch == ')' && newStack != '(') ||
                    (ch == ']' && newStack != '[') ||
                    (ch == '}' && newStack != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
