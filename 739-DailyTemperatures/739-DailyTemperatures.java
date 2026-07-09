// Last updated: 7/9/2026, 3:06:41 PM
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        Stack<Integer>s=new Stack();
        int[] ans=new int[n];
        for(int cd=0;cd<n;cd++){
            int x=temp[cd];
            while(!s.empty() && x>temp[s.peek()]){
                ans[s.peek()]=cd-s.peek();
                s.pop();
            }
            s.push(cd);
        }
        return ans;
    }
}