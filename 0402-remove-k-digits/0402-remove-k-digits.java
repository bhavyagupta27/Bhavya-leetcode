import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        if (len == k) return "0";

        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < len; i++) {
            char ch = num.charAt(i);
            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }
            st.push(ch);
        }

        // If k is still greater than 0, remove from the end
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // Build the string from the stack
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();

        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
