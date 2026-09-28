// Last updated: 9/28/2026, 10:19:41 PM
1public class Solution {
2    public List<String> addOperators(String num, int target) {
3        List<String> rst = new ArrayList<String>();
4        if(num == null || num.length() == 0) return rst;
5        helper(rst, "", num, target, 0, 0, 0);
6        return rst;
7    }
8    public void helper(List<String> rst, String path, String num, int target, int pos, long eval, long multed){
9        if(pos == num.length()){
10            if(target == eval)
11                rst.add(path);
12            return;
13        }
14        for(int i = pos; i < num.length(); i++){
15            if(i != pos && num.charAt(pos) == '0') break;
16            long cur = Long.parseLong(num.substring(pos, i + 1));
17            if(pos == 0){
18                helper(rst, path + cur, num, target, i + 1, cur, cur);
19            }
20            else{
21                helper(rst, path + "+" + cur, num, target, i + 1, eval + cur , cur);
22                
23                helper(rst, path + "-" + cur, num, target, i + 1, eval -cur, -cur);
24                
25                helper(rst, path + "*" + cur, num, target, i + 1, eval - multed + multed * cur, multed * cur );
26            }
27        }
28    }
29}