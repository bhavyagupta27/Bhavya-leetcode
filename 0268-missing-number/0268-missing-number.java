class Solution {
    public int missingNumber(int[] nums) {
        long n = nums.length;
        long sum = n*(n+1)/2;
        long numsSum = 0;
        for(long ele : nums){
            numsSum += ele;
        }
        return (int)(sum - numsSum);
    }
}