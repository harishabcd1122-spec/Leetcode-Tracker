// Last updated: 8/28/2026, 9:42:44 AM
1class Solution {
2    static void generate(String s,List<String> wordDict,List<String> res,StringBuilder curr,int i){
3        if(i>=s.length()){
4            res.add(curr.toString().trim());
5            return;
6        }
7        for(String word:wordDict){
8            if(s.startsWith(word,i)){
9                int l=curr.length();
10                curr.append(word).append(" ");
11                generate(s,wordDict,res,curr,i+word.length());
12                curr.setLength(l);
13            }
14        }
15    }
16    public List<String> wordBreak(String s, List<String> wordDict) {
17        List<String> res=new ArrayList<>();
18        generate(s,wordDict,res,new StringBuilder(),0);
19        return res;
20    }
21}