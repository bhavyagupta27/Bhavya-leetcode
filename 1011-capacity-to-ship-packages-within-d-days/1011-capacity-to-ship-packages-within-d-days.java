class Solution {   
    public int maxEle(int[] weights) {
        int max = 0;
        for (int w : weights) {
            if (w > max) {
                max = w;
            }
        }
        return max;
    }
    int sum = 0;
    public int sumEle(int[] weights) {
        for(int ele:weights){
            sum += ele;
        }
        return sum;
    }

     public int getDaysNeeded(int[] weights, int capacity) { // Fixed: parameter name changed to capacity
        int daysNeeded = 1;
        int currentLoad = 0;
        for (int w : weights) {
            if (currentLoad + w > capacity) {
                daysNeeded++;
                currentLoad = w;
            } else {
                currentLoad += w;
            }
        }
        return daysNeeded;
    }
    public int shipWithinDays(int[] weights, int days) {
    int start = maxEle(weights);
    int end = sumEle(weights);
    int result = end;

    while(start<=end){
    
    int mid = start + (end - start) / 2;
    int daysReq = getDaysNeeded(weights , mid);

    if(daysReq <= days){
        result = mid;
        end = mid - 1;
    }else{
        start = mid+1;
    }
    }
        return result;
    }
}