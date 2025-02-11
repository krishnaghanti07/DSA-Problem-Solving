// package Binary Search.BS on Answers;

public class CapacityToShipPackagesWithinDDays002 {
    class Solution {
        public int findMax(int[] arr) {
            int n = arr.length ;
            int maxi = Integer.MIN_VALUE ;
            for(int i=0 ; i<n ; i++) {
                maxi = Math.max(arr[i] , maxi) ;
            }
            return maxi ;
        }
    
        public int findSum(int[] arr) {
            int n = arr.length ;
            int sum = 0 ;
            for (int i=0 ; i<n ; i++) {
                sum += arr[i] ;
            }
            return sum ;
        }
    
        public int daysReq(int[] arr , int capacity) {
            int n = arr.length ;
            int totalDays = 1 ;
            int load = 0 ;
    
            for (int i=0 ; i<n ; i++) {
                if (load+arr[i] > capacity) {
                    totalDays++ ;
                    load = arr[i] ;
                } else {
                    load += arr[i] ;
                }
            }
            return totalDays ;
        }
    
        public int shipWithinDays(int[] arr, int days) {
            int n = arr.length ;
            int low = findMax(arr);
            int high = findSum(arr);
            int ans = n ;
    
            while (low <= high) {
                int mid = low + (high-low)/2 ;
    
                if (daysReq(arr , mid) <= days) {
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
