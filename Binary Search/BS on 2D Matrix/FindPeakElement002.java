// package Find a Peak Element II;

public class FindPeakElement002 {
    class Solution {
    
        // This method finds the index of the maximum element in the given column 'col' of the matrix 'mat'.
        public int maxElement(int[][] mat, int n, int m, int col) {
            int maxIndex = 0;
            for (int i = 1; i < n; i++) {
                if (mat[i][col] > mat[maxIndex][col]) {
                    maxIndex = i;
                }
            }
            return maxIndex;
        }
    
        public int[] findPeakGrid(int[][] mat) {
            int n = mat.length; // Number of rows
            int m = mat[0].length; // Number of columns
            int low = 0, high = m - 1;
    
            // Binary search on columns to find the peak
            while (low <= high) {
                int mid = low + (high - low) / 2;
                
                // Find the row index of the maximum element in the middle column
                int row = maxElement(mat, n, m, mid);
                
                // Get the values of the left and right neighbors
                int left = (mid - 1 >= 0) ? mat[row][mid - 1] : -1; // Left neighbor
                int right = (mid + 1 < m) ? mat[row][mid + 1] : -1; // Right neighbor
    
                // If the current element is greater than both left and right neighbors, it's a peak
                if (mat[row][mid] > left && mat[row][mid] > right) {
                    return new int[] {row, mid}; // Return the peak position
                } 
                // If the left neighbor is greater, move the search space to the left half
                else if (mat[row][mid] < left) {
                    high = mid - 1;
                } 
                // Otherwise, move the search space to the right half
                else {
                    low = mid + 1;
                }
            }
    
            // If no peak is found, return [-1, -1]
            return new int[] {-1, -1};
        }
    }
    
}
