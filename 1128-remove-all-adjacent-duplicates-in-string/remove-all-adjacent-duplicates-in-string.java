class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                if (stack.peek() != ch) {
                    stack.push(ch);
                } else {
                    stack.pop();
                }
            }
        }

        String str = "";
        for (char c : stack) {
            str = str + c;
        }

        return str;
    }
}