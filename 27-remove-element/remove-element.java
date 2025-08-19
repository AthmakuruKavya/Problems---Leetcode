class Solution {
    public int removeElement(int[] nums, int val) {
        //int si = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                // swap(si,i,nums);
                nums[count] = nums[i];
                count++;
                //si++;
            }
        }
        return count++;
    }
    static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}