// Last updated: 7/9/2026, 3:05:15 PM
class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid=new char[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(grid[i],'#');
        }
        for(int i=0;i<n;i++){
            grid[0][i]='.';
        }
        for(int i=0;i<m;i++){
            grid[i][n-1]='.';
        }
        List<String>ans=new ArrayList<>();
        
        for(int i=0;i<m;i++) {
            ans.add(new String(grid[i]));
        }
        return ans.toArray(new String[0]);
    }
}