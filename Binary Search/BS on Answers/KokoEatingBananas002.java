// package Binary Search.BS on Answers;

public class KokoEatingBananas002 {
    class Solution {
        public int findMax(int[] arr) {
            int n = arr.length ;
            int maxi = Integer.MIN_VALUE ;
            for (int i=0 ; i<n ; i++) {
                maxi = Math.max(arr[i] , maxi) ;
            }
            return maxi ;
        }
    
        public int calcTime(int[] arr , int time) {
            int n = arr.length ;
            int totalTime = 0 ;
            for (int i=0 ; i<n ; i++) {
                totalTime += Math.ceil((double)arr[i]/(double)time) ;
            }
            return totalTime ;
        }
    
        public int minEatingSpeed(int[] arr, int h) {
            // int n = arr.length ;
            int low = 1 , high = findMax(arr) ;
            int ans = 1 ;
    
            while (low <= high) {
                int mid = low + (high-low)/2 ;
                int maxTime = calcTime(arr , mid) ;
    
                if (maxTime <= h) {
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
