class Solution {
    public int removeElement(int[] nums, int val) {
        int startidx=0;
        int expexctedNums[]=new int[nums.length];
        for(int i = 0 ;i<nums.length;i++){
                if(nums[i]==val){
                }else{
                    nums[startidx] = nums[i];
                    startidx++;
            }
        }
        return startidx;
    }
}