// Last updated: 9/28/2026, 9:09:39 PM
1class Solution {
2    public String fractionToDecimal(int numerator, int denominator) {
3        if (numerator == 0)
4            return "0";
5        
6        StringBuilder fraction = new StringBuilder();
7        if (numerator < 0 ^ denominator < 0)
8            fraction.append("-");        
9
10        long dividend = Math.abs(Long.valueOf(numerator));
11        long divisor = Math.abs(Long.valueOf(denominator));
12        fraction.append(dividend / divisor);
13        long remainder = dividend % divisor;
14        if (remainder == 0) {
15            return fraction.toString();
16        }
17
18        fraction.append(".");
19        Map<Long, Integer> map = new HashMap<>();
20        while (remainder != 0) {
21            if (map.containsKey(remainder)) {
22                fraction.insert(map.get(remainder), "(");
23                fraction.append(")");
24                break;
25            }
26            map.put(remainder, fraction.length());
27            remainder *= 10;
28            fraction.append(remainder / divisor);
29            remainder %= divisor;
30        }
31
32        return fraction.toString();
33    }
34}
35
36