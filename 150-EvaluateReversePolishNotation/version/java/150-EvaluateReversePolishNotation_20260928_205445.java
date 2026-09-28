// Last updated: 9/28/2026, 8:54:45 PM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> st=new Stack<>();
4        String opr="+-/*";
5        for(String tok:tokens){
6            if(opr.indexOf(tok)!=-1){
7                int d1=st.pop();
8                int d2=st.pop();
9                int res=0;
10                if(tok.equals("+")){
11                    res=d2+d1;
12                }
13                else if(tok.equals("-")){
14                    res=d2-d1;
15                }
16                else if(tok.equals("/")){
17                    res=d2/d1;
18                }
19                else if(tok.equals("*")){
20                    res=d2*d1;
21                }
22                st.push(res);
23            }
24            else{
25                st.push(Integer.parseInt(tok));
26            }
27        }
28        return st.peek();
29    }
30}