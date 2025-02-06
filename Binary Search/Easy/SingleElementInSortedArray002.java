public class SingleElementInSortedArray002 {
    
    class Solution {
        public int singleNonDuplicate(int[] arr) {
            int n = arr.length ;
            int st = 0 , end = n-1 ;
            if (n == 1) return arr[0] ;
    
            while (st <= end) {
                int mid = st + (end-st)/2 ;
                if (mid==0 && arr[0]!=arr[1]) return arr[mid] ;
                if (mid==n-1 && arr[n-1]!=arr[n-2]) return arr[mid] ;
    
                if (arr[mid-1]!=arr[mid] && arr[mid]!=arr[mid+1]) return arr[mid] ;
                else if (mid%2 == 0) { // Even both side
                    if (arr[mid-1] == arr[mid]) end = mid-1 ;
                    else st = mid+1 ;
                } else { // Odd both side
                    if (arr[mid-1] == arr[mid]) st = mid+1 ;
                    else end = mid-1 ;
                }
            }
            return -1 ;
        }
    }
}
