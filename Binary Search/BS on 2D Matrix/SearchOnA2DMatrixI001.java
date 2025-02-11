// package Binary Search.BS on 2D Matrix;

public class SearchOnA2DMatrixI001 {
    class Solution {
        public boolean searchMatrix(int[][] arr, int target) {
            int m = arr.length ;
            int n = arr[0].length ;
            int low = 0 , high = (m*n)-1 ;
    
            if (arr == null || arr.length == 0 || arr[0].length == 0) {
                return false;
            }
    
            while (low <= high) {
                int mid = low + (high-low)/2 ;
                if (arr[mid/n][mid%n] == target) {
                    return true ;
                } else if (arr[mid/n][mid%n] > target) {
                    high = mid-1 ;
                } else {
                    low = mid+1 ;
                }
            }
            return false ;
        }
    }
}
