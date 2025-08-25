class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int si = 0;
        int ei = numbers.length-1;
        while(si<ei){
            int sum = numbers[si] + numbers[ei];
            if(sum == target){
                break;
            }else if(sum<target){
                si++;
            }else{
                ei--;
            }
        }
        return new int[] {si+1,ei+1};
        // for(int i=0;i<numbers.length-1;i++){
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[i]+numbers[j] == target){
        //             return new int[]{i+1,j+1};
        //         }
        //     }
        // }
        // return new int[] {-1,-1};
    }
}