class Solution {
    public int majorityElement(int[] nums) {
        int count =1;
        int cand = nums[0];
        for(int i =0;i<nums.length;i++){
            if(nums[i]==cand){
                count++;
            }else{
                count--;
            }
            if(count==0){
                cand = nums[i];
                count =1;
            }
        }
        int c = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==cand){
                c++;
                if(c>nums.length/2){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}