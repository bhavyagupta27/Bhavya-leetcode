import java.util.*;
class Solution {
    public int maxEle(int[] piles){
        Arrays.sort(piles);
        return piles[piles.length-1];
        }
    public int minEatingSpeed(int[] piles, int h) {
       
        int start = 1; 
        int end = maxEle(piles);
        int result = end;
        
        while(start<=end){
            int mid = (start+end)/2;

            long totalHours = 0;
            for(int pile: piles){
                totalHours += (pile + mid -1)/mid;
            }
            if(totalHours <= h){
                result = mid;
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return result;
    }
}