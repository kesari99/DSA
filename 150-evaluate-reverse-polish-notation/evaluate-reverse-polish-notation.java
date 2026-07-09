class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (String ch : tokens) {

            if (ch.equals("+") || ch.equals("-") ||
                    ch.equals("*") || ch.equals("/")) {
                int right = stack.pop();
                int left = stack.pop();

                if (ch.equals("+"))  {
                    stack.push(left + right);
                }
                if (ch.equals("-") ) {
                    stack.push(left - right);
                }
                if (ch.equals("*") ) {
                    stack.push(left * right);
                }
                if (ch.equals("/") ) {
                    stack.push(left / right);
                }

            } else {
                stack.push(Integer.parseInt(ch));

            }

        }

        return stack.pop();

    }
}