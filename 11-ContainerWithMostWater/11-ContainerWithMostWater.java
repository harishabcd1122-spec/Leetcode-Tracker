// Last updated: 7/9/2026, 3:10:48 PM
class Solution{
    public  int maxArea(int[] height){
        Scanner sc=new Scanner(System.in);
        int start=0;
        int end=height.length-1;
        int maxArea=0;
        while(start<end){
            int m=Math.min(height[start],height[end]);
            int a=Math.abs(start-end);
            int Area=m*a;
            maxArea=Math.max(maxArea,Area);

            if  (height[start] < height[end]) {
                 start++;
            }
            else{
                end--;
            }
        }
        return maxArea;
    }
}