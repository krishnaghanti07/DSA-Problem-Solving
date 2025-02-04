// package Binary Search.Easy;

public class SearchInesrt003 {
    class Solution {
        public int searchInsert(int[] arr, int target) {
            int n = arr.length ;
            int ans = n ;
            int low = 0 , high = n-1 ; // It's Similar to find the upper-bound
    
            while (low <= high) {
                int mid = low + (high-low)/2 ;
                if (arr[mid] >= target) {
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
