import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int si = 0;
        int ei = height.length-1;
        int max = 0;
        while(si < ei){
            int d = ei-si;
            int minVal = Math.min(height[si], height[ei]);
            int cVal = d*minVal;
            max = Math.max(cVal, max);
            if(height[si]>height[ei]){
                ei--;
            }else{
                si++;
            }
        }
        return max;
    }
}