public class SearchInRotatedAndSortedArray001 {
    class Solution {
        public int search(int[] nums, int target) {
            int n = nums.length;
            if (n == 0) return -1; // If the array is empty, return -1
            if (n == 1) return nums[0] == target ? 0 : -1; // Special case for a single element
    
            int peak = findPeak(nums);
            int p = -1;
    
            // Ensure we don't access nums[-1]
            if (peak != -1 && nums[peak] == target) return peak;
            
            // Search in the left half of the peak
            p = findInLeft(nums, 0, peak, target);
            if (p != -1) return p;
    
            // Search in the right half of the peak
            p = findInRight(nums, peak + 1, n - 1, target);
            return p;
        }
    
        public int findInRight(int[] arr, int start, int end, int target) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }
    
        public int findInLeft(int[] arr, int start, int end, int target) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }
    
        public int findPeak(int[] arr) {
            int n = arr.length;
            int start = 0;
            int end = n - 1;
    
            // If the array is not rotated (fully sorted), return the last element index
            if (arr[start] < arr[end]) return n - 1;
    
            while (start < end) {
                int mid = start + (end - start) / 2;
    
                // Ensure that mid + 1 is within bounds
                if (mid < n - 1 && arr[mid] > arr[mid + 1]) {
                    return mid; // Mid is the peak element
                }
                // If middle element is greater than or equal to the start, 
                // the peak must be on the right side (rotated part).
                else if (arr[mid] >= arr[start]) {
                    start = mid + 1;
                } else {
                    // Otherwise, it lies in the left half
                    end = mid;
                }
            }
    
            // Start will point to the smallest element
            return start;
        }
    }
    
}
