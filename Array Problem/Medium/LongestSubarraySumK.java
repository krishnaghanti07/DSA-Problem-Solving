package Medium;

public class LongestSubarraySumK {
    class Solution {
        public int subarraySum(int[] arr, int k) {
            int n = arr.length ;
            int i = 0 ;
            int j = 0 ;
            int sum = arr[0] ;
            int count = 0 ;
    
            while (j < n) {
                while (i<=j && sum>k) {
                    sum -= arr[i];
                    i++ ;
                }
                if (sum == k) {
                    count = Math.max(count , j-i+1);
                }
                j++ ;
                if (j < n) {
                    sum += arr[j];
                }
            }
            return count ;        
        }
    }
}
