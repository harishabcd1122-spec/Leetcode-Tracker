// Last updated: 9/25/2026, 12:53:46 PM
public class Solution extends VersionControl {

    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)==true && isBadVersion(mid-1)==false)   return mid;
            else if(isBadVersion(mid)==false ) low = mid+1;
            else high= mid;
        }     
        return -1;
    }
}