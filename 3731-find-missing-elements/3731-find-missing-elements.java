class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        List<Integer> ans=new ArrayList<>();
        for(int i = 0 ; i<nums.length;i++){
          if(nums[i]<smallest){
            smallest=nums[i];
          }
          if(nums[i]>largest){
            largest=nums[i];
          } 
        }
        for(int i = smallest ; i <=largest ; i++){
        boolean found = false;
            for(int j = 0; j < nums.length; j++){
    if(nums[j] == i){
        found = true;
        break;
    }
             }if(!found){
            ans.add(i);
            }
        }
return ans;
    }
}