// Last updated: 7/9/2026, 3:05:30 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int total=0;
        while(mainTank>=5){
            total+=50;
            mainTank-=5;
            if(additionalTank>=1) {mainTank++; additionalTank--;}
            }
            return(total+(mainTank*10));
    }
}