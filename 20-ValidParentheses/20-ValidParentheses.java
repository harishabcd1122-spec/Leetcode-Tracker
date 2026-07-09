// Last updated: 7/9/2026, 3:10:32 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack();
        char [] ch=s.toCharArray();
        for(char c:ch){
            if(c == '(' || c=='[' || c=='{') st.push(c);
            else {
                if (st.empty()) return false;
                else if(c==')' && st.peek()=='(') st.pop();
                else if(c==']' && st.peek()=='[' )st.pop();
                else if(c=='}' && st.peek()=='{') st.pop();
                else return false;
            }
        }
        return st.empty();
    }
}