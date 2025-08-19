class Solution {
    public int maxProfit(int[] stocks) {
        int profit = 0;
        for(int i=0; i<stocks.length-1; i++){
            int val = stocks[i+1]-stocks[i];
            if(val>0){
                profit = val+profit;
            }
        }
        return profit;





        // int small = Integer.MAX_VALUE;
        // int big = 0;
        // int dif = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] < small) {
        //         small = nums[i];
        //         big = nums[i];
        //     }
        //     if (nums[i] > big) {
        //         big = nums[i];
        //         int val = big - small + dif;
        //         if (val > dif) {
        //             dif = val;
        //         }
        //         small = nums[i];
        //     }

        // }
        // return dif;
    }
}