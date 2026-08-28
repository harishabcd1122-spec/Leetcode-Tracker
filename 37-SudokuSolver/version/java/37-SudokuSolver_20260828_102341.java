// Last updated: 8/28/2026, 10:23:41 AM
1class Solution {
2    public String getPermutation(int n, int k) {
3      List<Integer> list=new ArrayList<>();
4      int fact=1;
5      for(int i=1;i<=n;i++){
6            fact*=i;
7            list.add(i);
8      }  
9      fact/=n;
10      k-=1;
11      StringBuilder sb=new StringBuilder();
12      while(true){
13        sb.append(list.get(k / fact));
14        list.remove(k / fact);
15        if(list.size() == 0)break;
16        k%=fact;
17        fact/=list.size();
18      }
19      return String.valueOf(sb);
20    }
21}