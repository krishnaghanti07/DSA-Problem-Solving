package Easy;
public class ReverseArrayRecursive {
    class Solution {
        public void reverseArray(int arr[]) {
            // code here
            int n = arr.length;
            int i=0 ;
            while (i < n/2) {
                int temp = arr[i] ;
                arr[i] = arr[n-i-1] ;
                arr[n-i-1] = temp ;
                i++ ;
            }
        }
    }
}
