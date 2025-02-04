// package Binary Search.Easy;

import java.util.Arrays;

public class FloorAndCeil002 {
    class Solution {
        public int[] getFloorAndCeil(int x, int[] arr) {
            // code here
            Arrays.sort(arr) ;
            int n = arr.length ;
            int low = 0 , high = n-1 ;
            int ans1 = -1 , ans2 = -1 ;
            
            while (low <= high) {
                int mid = low + (high-low)/2 ;
                
                if (arr[mid] <= x) {
                    ans1 = arr[mid] ;
                    low = mid+1 ;
                } else {
                    high = mid-1 ;
                }
            }
            
            low = 0 ;
            high = n-1 ;
            while (low <= high) {
                int mid = low + (high-low)/2 ;
                
                if (arr[mid] >= x) {
                    ans2 = arr[mid] ;
                    high = mid-1 ;
                } else {
                    low = mid+1 ;
                }
            }
            return new int[] {ans1 , ans2} ;
        }
    }
    
}
