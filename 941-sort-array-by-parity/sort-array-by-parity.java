class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int i=0;
        int j=1;
        while(j<arr.length){
            if(arr[i]%2==0){
                i++;
                j++;
            }else{
                if(arr[j]%2 == 0){
                    swap(arr,i,j);
                    i++;
                    j++;
                }else{
                    j++;
                }
            }
        }
        return arr;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}