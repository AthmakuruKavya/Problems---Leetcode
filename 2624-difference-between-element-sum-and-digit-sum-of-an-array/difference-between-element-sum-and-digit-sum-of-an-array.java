class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<nums.length; i++){
            sum1+=nums[i];
            if(nums[i]>9){
                sum2 = sum2 + digitSum(nums[i]);
            }else{
                sum2+=nums[i];
            }
        }
        return sum1-sum2;
    }
    public int digitSum(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            n = n/10;
        }
        return sum;
    }
}