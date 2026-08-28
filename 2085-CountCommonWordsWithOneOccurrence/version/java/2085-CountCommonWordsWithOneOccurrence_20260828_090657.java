// Last updated: 8/28/2026, 9:06:57 AM
1class Solution
2{
3    public int countWords(String[] words1, String[] words2)
4    {
5        HashMap<String, Integer> map1 = new HashMap<>();
6        HashMap<String, Integer> map2 = new HashMap<>();
7		
8        for(String word : words1)
9            map1.put(word,map1.getOrDefault(word,0)+1);
10        for(String word : words2)
11            map2.put(word,map2.getOrDefault(word,0)+1);
12			
13        int count = 0;
14        for(String word : words1)
15            if(map1.get(word) == 1 && map2.getOrDefault(word,0) == 1)
16                count++;
17        return count;
18    }
19}