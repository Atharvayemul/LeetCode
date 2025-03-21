// https://leetcode.com/problems/sum-of-variable-length-subarrays/description/



class Solution {
    public int subarraySum(int[] nums) {
        int n = nums.length;
        int[] prefixsum = new int[n];
        prefixsum[0] = nums[0];
        int sum = 0;
        for (int i = 1 ; i < n ; i++){
            prefixsum[i] = prefixsum[i-1] + nums[i];
        }
        for(int i = 0 ; i < n ; i++){
            int start = Math.max(0,i-nums[i]);
            if (start == 0){
                sum += prefixsum[i];
            }else{
                sum += prefixsum[i] - prefixsum[start-1];
            }
        }
        return sum;
        
    }
}