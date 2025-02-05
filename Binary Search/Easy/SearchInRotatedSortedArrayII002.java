public class SearchInRotatedSortedArrayII002 {
    class Solution {
        public boolean search(int[] arr, int target) {
            int n = arr.length ;
            int st = 0 , end = n-1 ;
            
            while (st <= end) {
                int mid = st + (end-st)/2 ;
    
                if (arr[mid] == target) return true ;
                else if (arr[st]==arr[mid] && arr[mid]==arr[end]) {
                    st = st+1 ;
                    end = end-1 ;
                    continue ;
                }
                else if (arr[st] <= arr[mid]) {
                    if (arr[st]<=target && target<=arr[mid]) {
                        end = mid-1 ;
                    } else {
                        st = mid+1 ;
                    }
                } else {
                    if (arr[mid]<=target && target<=arr[end]) {
                        st = mid+1 ;
                    } else {
                        end = mid-1 ;
                    }
                }
            }
            return false ;
        }
    }
}
