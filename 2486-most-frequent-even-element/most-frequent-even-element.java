class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            if(num%2 == 0){
                if(!map.containsKey(num)){
                    map.put(num, 1);
                }else{
                    map.put(num, map.get(num)+1);
                }
            }
        }
        if(map.size() ==0){
            return -1;
        }
        int val = 0;
        int count = 0;
        for(int key : map.keySet()){
            if(map.get(key) >count){
                count = map.get(key);
                val = key;
            }
            if(map.get(key) == count){
                if(key< val){
                    val = key;
                }
            }

        }
        return val;
        
    }
}