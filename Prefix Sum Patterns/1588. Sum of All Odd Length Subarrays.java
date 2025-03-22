// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/


class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;

        for (int left = 0 ; left < arr.length ; left++){

            for (int right = left ; right < arr.length ; right ++){

                if((right - left + 1 ) % 2 != 0){
                    for (int k = left ; k <= right ; k++){
                        sum += arr[k];
                    }
                }
            }
        }
        return sum;
        
    }
}