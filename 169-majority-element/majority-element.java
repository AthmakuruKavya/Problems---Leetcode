class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int num : nums){
          if(!map.containsKey(num)){
            map.put(num,1);
          }else{
            map.put(num, map.getOrDefault(num,0)+1);
          }
       }
       int val = 0;
       for(int num : map.keySet()){
            if(map.get(num) > nums.length/2){
                val = num;
            }
       }
       return val;
    }
}