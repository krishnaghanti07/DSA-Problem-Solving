// package Binary Search.BS on Answers;

public class MinimumDaysToMakeMBouquets002 {
    class Solution {
        public int findMax(int[] arr) {
            int n = arr.length ;
            int maxi = Integer.MIN_VALUE ;
            for (int i=0 ; i<n ; i++) {
                maxi = Math.max(arr[i] , maxi);
            }
            return maxi ;
        }
    
        public int findMin(int[] arr) {
            int n = arr.length ;
            int mini = Integer.MAX_VALUE ;
            for (int i=0 ; i<n ; i++) {
                mini = Math.min(arr[i] , mini);
            }
            return mini ;
        }
    
        public boolean isBloomed(int[] arr , int mid , int m , int k) {
            int n = arr.length ;
            int count = 0 ;
            int totalBloom = 0 ;
            for (int i=0 ; i<n ; i++) {
                if (mid >= arr[i]) {
                    count++ ;
                } else {
                    totalBloom += (count/k);
                    count = 0 ;
                }
            }
            totalBloom += (count/k) ;
            if (totalBloom >= m) return true ;  // return (totalBloom >= m);
            else return false ;
        }
    
        public int minDays(int[] arr, int m, int k) {
            int n = arr.length ;
            long val = (long) m*k ;
            if (val > n) return -1 ;
            
            int low = findMin(arr) ;
            int high = findMax(arr) ;
            int ans = high ;
    
            while (low <= high) {
                int mid = low + (high-low)/2 ;
    
                if (isBloomed(arr , mid , m , k)) {
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
