public class FindMinimumElementInRotatedSortedArray003 {
    class Solution {
        public int findMin(int[] arr) {
            int n = arr.length ;
            int st = 0 , end = n-1 ;
            int ans = Integer.MAX_VALUE ;
    
            while (st <= end) {
                int mid = st + (end-st)/2 ;
    
                if (arr[st] <= arr[mid]) {
                    ans = Math.min(arr[st] , ans);
                    st = mid+1 ;
                } else {
                    ans = Math.min(arr[mid] , ans);
                    end = mid-1 ;
                }
            }
            return ans ;
        }
    }
}
