class Solution {
    public boolean hourRequired(int[] piles,int mid, int H){
         long totalTime = 0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]%mid!=0)
                totalTime++;
            totalTime+=piles[i]/mid;
        }
        if(totalTime<=H) return true;
        else return false;
    }
    public int minEatingSpeed(int[] piles, int H) {
        int l = 1, h =0;
        for(int i=0;i<piles.length;i++){
            h=Math.max(h,piles[i]);
        }
        int minspeed=0;
        while (l <= h) {
            int mid = l + (h-l)/ 2;
            if (hourRequired(piles,mid,H)){
                minspeed=mid;
                h = mid -1;
            }  
            else
                l = mid +1;
        }
        return minspeed;
    }
}