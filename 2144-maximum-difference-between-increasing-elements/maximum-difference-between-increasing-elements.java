class Solution {
    public int maximumDifference(int[] arr) {
        int small = arr[0];
        int big = arr[0];
        int i=1;
        int diff = -1;
        while(i<arr.length){
            if(arr[i]<small){
                small= arr[i];
                big = arr[i];
            }
            if(arr[i]>big){
                big = arr[i];    
            }
            int val = big - small;
            if(val>diff && small<big){
                diff =val;
            }
            i++;
        }
        return diff;
    }
}