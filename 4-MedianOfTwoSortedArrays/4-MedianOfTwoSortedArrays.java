// Last updated: 7/9/2026, 3:10:59 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int index=0;
        for(int i=0;i<nums1.length;i++){
            arr[index]=nums1[i];
            index++;
        }
        for(int i=0;i<nums2.length;i++){
            arr[index]=nums2[i];
            index++;
        }
        Arrays.sort(arr);
        if(arr.length%2!=0){
            return arr[arr.length/2];
        }
        return ((double)arr[(arr.length/2)]+arr[(arr.length/2)-1])/2;
    }
}