// https://leetcode.com/problems/maximum-subarray/


package Arrays;

public class _53_Maximum_Subarray {

    public static void main(String[] args) {
        class Solution {
            public int maxSubArray(int[] nums) {
        
                int sum = nums[0];
                int curr_sum = nums[0];
        
                for (int i = 1 ; i < nums.length ; i++){
        
                    curr_sum = Math.max(nums[i],curr_sum + nums[i]);
                    sum = Math.max(curr_sum,sum);
                }
        
                return sum;
                
            }
        }
    }
}