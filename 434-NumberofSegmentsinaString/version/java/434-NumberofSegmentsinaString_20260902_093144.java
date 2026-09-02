// Last updated: 9/2/2026, 9:31:44 AM
1class Solution
2{
3   public String multiply(String num1, String num2) {
4    int m = num1.length(), n = num2.length();
5    int[] pos = new int[m + n];
6   
7    for(int i = m - 1; i >= 0; i--) {
8        for(int j = n - 1; j >= 0; j--) {
9            int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
10            int p1 = i + j, p2 = i + j + 1;
11            int sum = mul + pos[p2];
12
13            pos[p1] += sum / 10;
14            pos[p2] = (sum) % 10;
15        }
16    }  
17    
18    StringBuilder sb = new StringBuilder();
19    for(int p : pos) if(!(sb.length() == 0 && p == 0)) sb.append(p);
20    return sb.length() == 0 ? "0" : sb.toString();
21}
22}