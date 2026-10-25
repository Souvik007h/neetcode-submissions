class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else {
                if(stack.size() == 0){
                    return false;
                }
                char tem = stack.pop();
                if ((ch == ')' && tem != '(') || (ch == '}' && tem != '{')
                    || (ch == ']' && tem != '[')){
                        return false;
                    }
            }
        }

        return (stack.size() == 0) ? true : false;
    }
}
