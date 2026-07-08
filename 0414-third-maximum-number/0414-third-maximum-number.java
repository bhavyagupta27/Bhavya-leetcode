class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                first = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > second && nums[i] != first) {
                second = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > third && nums[i] != second && nums[i] != first) {
                third = nums[i];
            }
            
        }

        System.out.println(third);

        
            if (third == Long.MIN_VALUE) {
                return (int) first;
            }
        return (int) third;
    }
}