// package Binary Search.BS on Answers;

public class BookAllocationProblem002 {
    class Solution {
        public static int findMax (int[] arr) {
            int n = arr.length ;
            int maxi = Integer.MIN_VALUE ;
            for (int i=0 ; i<n ; i++) {
                maxi = Math.max(arr[i] , maxi) ;
            }
            return maxi ;
        }
        
        public static int findSum (int[] arr) {
            int n = arr.length ;
            int sum = 0 ;
            for (int i=0 ; i<n ; i++) {
                sum += arr[i] ;
            }
            return sum ;
        }
        
        public static int countStu(int[] arr , int pages) {
            int n = arr.length ;
            int stu = 1 , pagesStudent = 0 ;
            
            for (int i=0 ; i<n ; i++) {
                if ((pagesStudent+arr[i]) <= pages) {
                    pagesStudent += arr[i] ;
                } else {
                    stu++ ;
                    pagesStudent = arr[i] ;
                }
            }
            return stu ;
        }
        
        public static int findPages(int[] arr, int k) {
            // code here
            int n = arr.length ;
            int low = findMax(arr) ;
            int high = findSum(arr) ;
            
            if (k > n) return -1 ;
            
            while (low <= high) {
                int mid = low + (high-low)/2 ;
                int noStu = countStu(arr , mid) ;
                
                if (noStu > k) low = mid+1 ;
                else high = mid-1 ;
            }
            return low ;
        }
    }
}
