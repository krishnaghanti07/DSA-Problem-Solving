public class FindPeakElement002 {
    class Solution {
        public int findPeakElement(int[] arr) {
            int n = arr.length ;
            if (n == 1) return 0 ;
            if (arr[0] > arr[1]) return 0 ;
            if (arr[n-1] > arr[n-2]) return n-1 ;
    
            int st = 1 , end = n-2 ;
            while (st <= end) {
                int mid = st + (end-st)/2 ;
                if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
                    return mid ;
                } else if (arr[mid] > arr[mid-1]) {
                    st =  mid+1 ;
                } else {
                    end = mid-1 ;
                }
            }
            return -1 ;
        }
    }
    
    // int n = arr.length ;
    //         int start = 0 ;
    //         int end = n-1 ;
    //         while (start < end) {
    //             int mid = start + (end-start)/2 ;
    //             if (arr[mid] > arr[mid+1]) {
    //                 end = mid ;
    //             } else {
    //                 start = mid+1 ;
    //             }
    //         }
    //         return start ;
}
