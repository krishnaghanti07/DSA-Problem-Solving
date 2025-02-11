// package Binary Search.BS on Answers;

import java.util.Arrays;

public class AggressiveCows0032 {
    class Solution {
        public static boolean canWePlace(int[] arr , int dist , int cows) {
            int n = arr.length ;
            int countCows = 1 ;
            int last = arr[0] ;
            
            for (int i=0 ; i<n ; i++) {
                if ((arr[i]-last) >= dist) {
                    countCows++ ;
                    last = arr[i] ;
                }
            }
            return (countCows >= cows) ;
        }
        
        public static int aggressiveCows(int[] arr, int k) {
            // code here
            int n = arr.length ;
            Arrays.sort(arr);
            int low = 1 , high = arr[n-1] - arr[0] ;
            int ans = 1 ;
            
            while (low <= high) {
                int mid = low + (high-low)/2 ;
                
                if (canWePlace(arr , mid , k)) {
                    ans = mid ;
                    low = mid+1 ;
                } else {
                    high = mid-1 ;
                }
            }
            return ans ;
        }
    }
}
