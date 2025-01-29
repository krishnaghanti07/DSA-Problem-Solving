package Medium;

public class SortColors001 {
    
    class Solution {
        public void swap(int[] arr , int a , int b) {
            int temp = arr[a] ;
            arr[a] = arr[b] ;
            arr[b] = temp ;
        }
    
        public void sortColors(int[] arr) {
            int n = arr.length ;
            int low = 0 ;
            int high = n-1 ;
            int mid = 0 ;
    
            while (mid <= high) {
                if (arr[mid] == 0) {
                    swap(arr , mid , low) ;
                    low++ ;
                    mid++ ;
                } else if (arr[mid] == 2) {
                    swap(arr , mid , high) ;
                    high-- ; //we'll not increase the mid (because the element swapped can be zero or two also)
                } else {
                    mid++ ;
                }
            }
        }
    }
}
