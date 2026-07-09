// Last updated: 7/9/2026, 3:06:18 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        
        int max=-1;
        int cmax=-1;
        for(int i=arr.length-1;i>=0;i--){
            if (arr[i] > cmax) cmax=arr[i];
                arr[i]=max;
                max=cmax;
        }
        return arr;
        
    }
}