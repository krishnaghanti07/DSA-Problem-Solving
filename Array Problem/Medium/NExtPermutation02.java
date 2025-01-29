package Medium;

public class NExtPermutation02 {
    class Solution {
        public void swap(int[] arr , int i , int j) {
            int temp = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = temp ;
        }
    
        public void rev(int[] arr , int i , int j) {
            while (i < j) {
                swap (arr , i , j);
                i++ ;
                j-- ;
            }
        }
    
        public void nextPermutation(int[] arr) {
            int n = arr.length ;
            int idx = -1 ;
    
            for (int i=n-2 ; i>=0 ; i--) {
                if (arr[i] < arr[i+1]) {
                    idx = i ;
                    break ;
                }
            }
            if (idx == -1) {
                rev (arr , 0 , n-1);
                return  ;
            }
            for (int i=n-1 ; i>=0 ; i--) {
                if (arr[i] > arr[idx]) {
                    swap (arr , i , idx);
                    break ;
                }
            }
            rev (arr , idx+1 , n-1) ;
            return ;
        }
    }
}
