// Last updated: 9/28/2026, 8:45:10 PM
1class Solution {
2    public static  String reverseStr(String s, int k){
3        String result="";
4        boolean watcher=true;
5        int tracker=0;
6        for(int i=0;i<s.length()-(k-1);i+=k){
7            if(watcher){
8                
9                 for(int j=i+(k-1);j>=i;j--){
10                       result+=s.charAt(j);
11                 }
12                watcher=false;
13            }else{
14                watcher=true;
15                  for(int j=i;j<=i+(k-1);j++){
16                       result+=s.charAt(j);
17                 };
18            }
19            tracker=i+k;
20        }
21
22        int difference = s.length() - result.length();
23        
24        if(watcher){
25            for(int i=s.length()-1;i>=s.length()-difference;i--){
26                  result+=s.charAt(i);
27            }                
28        }else{
29            // int tracker=0;
30            //  for(int i=s.length()-difference;i<=k;i++){
31            //       result+=s.charAt(i);
32            //       tracker=i;
33            // }
34            for(int i=tracker;i<s.length();i++){
35                  result+=s.charAt(i);
36            }
37        }
38
39        return result;
40    }
41}