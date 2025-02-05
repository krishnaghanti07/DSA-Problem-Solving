public class SearchRotatedSortedArray002 {
    class Solution {
        public int search(int[] arr, int target) {
            int n = arr.length;
            int st = 0 , end = n-1 ;
    
            while (st <= end) {
                int mid = st + (end-st)/2 ;
    
                if (arr[mid] == target) return mid ;
                else if (arr[st] <= arr[mid]) { // if Left-Sorted
                    if (arr[st]<=target && target<=arr[mid]) { // Present in Left
                        end = mid-1 ;
                    } else { // Present in Right
                        st = mid+1 ;
                    }
                } else { // if Rightt-Sorted
                    if (arr[mid]<=target && target<=arr[end]) { // Present in Right
                        st = mid+1 ;
                    } else { // Present in Left
                        end = mid-1 ;
                    }
                }
            }
            return -1 ;
        }
    }
    
}
