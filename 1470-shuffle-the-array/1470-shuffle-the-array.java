class Solution {
    public int[] shuffle(int[] nums, int n) {
            int j = 0;
            int ans[]=new int[nums.length];
        for(int i = 0 ; i<n ; i++){
            ans[j]=nums[i];
            ans[j+1] = nums[n+i];
            j=j+2;
        }
        return ans;
    }
}