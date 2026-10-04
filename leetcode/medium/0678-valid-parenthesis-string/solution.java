class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> leftParentheses = new Stack<>();
        Stack<Integer> stars = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                leftParentheses.push(i);
            } else if (c == '*') {
                stars.push(i);
            } else if (c == ')') {
                if (!leftParentheses.isEmpty()) {
                    leftParentheses.pop();
                } else if (!stars.isEmpty()) {
                    stars.pop();
                } else {
                    return false;
                }
            }
        }

        while (!leftParentheses.isEmpty() && !stars.isEmpty()) {
            if (leftParentheses.peek() < stars.peek()) {
                leftParentheses.pop();
                stars.pop();
            } else {
                stars.pop();
            }
        }

        return leftParentheses.isEmpty();
    }
}
