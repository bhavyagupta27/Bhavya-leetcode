class Solution {
    public int searchInsert(int[] nums, int target) {
        int lb = 0 ;
        int ub = nums.length-1;
        int ans = nums.length;
        while(lb<=ub){
            int mid = lb+(ub-lb)/2;
            if(nums[mid]<target){
                lb= mid+1;
            }else{
                ans=mid;
                ub=mid-1;
            }
        }
        return ans;
    }
}