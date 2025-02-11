// package Binary Search.BS on Answers;

public class FindSmallestDivisorGivenThreshold002 {
    class Solution {
        public int findMax(int[] arr) {
            int n = arr.length ;
            int maxi = Integer.MIN_VALUE ;
            for (int i=0 ; i<n ; i++) {
                maxi = Math.max(arr[i] , maxi);
            }
            return maxi ;
        }
    
        public int getSum(int[] arr , int mid) {
            int n = arr.length ;
            int sum = 0 ;
            for (int i=0 ; i<n ; i++) {
                sum += Math.ceil((double)arr[i]/(double)mid);
            }
            return sum ;
        }
    
        public int smallestDivisor(int[] arr, int threshold) {
            int n = arr.length ;
            int ans = -1 ;
            int low = 1 , high = findMax(arr) ;
            if (threshold == n) return high ;
    
            while (low <= high) {
                int mid = low + (high-low)/2 ;
    
                if (getSum(arr , mid) <= threshold) {
                    ans = mid ;
                    high = mid-1 ;
                } else {
                    low = mid+1 ;
                }
            }
            return ans ;
        }
    }
}
