// Last updated: 7/9/2026, 3:08:38 PM
class Solution {

    public List<String> wordBreak(String s, List<String> wordDict) {

        Set<String> dict = new HashSet<>(wordDict);
        Map<String, List<String>> memo = new HashMap<>();

        return dfs(s, dict, memo);
    }

    private List<String> dfs(String s, Set<String> dict,
                             Map<String, List<String>> memo) {

        if (memo.containsKey(s))
            return memo.get(s);

        List<String> res = new ArrayList<>();

        if (s.length() == 0) {
            res.add("");
            return res;
        }

        for (String word : dict) {

            if (s.startsWith(word)) {

                List<String> list =
                        dfs(s.substring(word.length()), dict, memo);

                for (String str : list) {

                    if (str.equals(""))
                        res.add(word);
                    else
                        res.add(word + " " + str);
                }
            }
        }

        memo.put(s, res);

        return res;
    }
}