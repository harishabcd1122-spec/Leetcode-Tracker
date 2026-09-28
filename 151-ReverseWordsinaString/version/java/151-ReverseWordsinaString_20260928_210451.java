// Last updated: 9/28/2026, 9:04:51 PM
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.split(" ");
4        int left = 0;
5        int right = words.length - 1;
6
7        while (left < right) {
8            String temp = words[left];
9            words[left] = words[right];
10            words[right] = temp;
11            left++;
12            right--;
13        }
14
15        StringBuilder result = new StringBuilder();
16        for (String word : words) {
17            if (!word.isEmpty()) {
18                if (result.length() > 0) {
19                    result.append(" ");
20                }
21                result.append(word);
22            }
23        }
24
25        return result.toString();
26    }
27}