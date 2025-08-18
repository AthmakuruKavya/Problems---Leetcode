class Solution {
    public int maxProfit(int[] nums) {
        int small = Integer.MAX_VALUE;;
        int big = 0;
        int dif = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] <small){
                small = nums[i];
                big = nums[i];
            }
            if(nums[i] > big){
                big = nums[i];
            }
            int val = big - small;
            if(val>dif){
                dif =val;
            }
        }
        return dif;
    }
}