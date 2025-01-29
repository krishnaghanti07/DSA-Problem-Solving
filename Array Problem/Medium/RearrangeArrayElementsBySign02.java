package Medium;

public class RearrangeArrayElementsBySign02 {
    class Solution {
        public int[] rearrangeArray(int[] arr) {
            int n = arr.length ;
            int[] ans = new int[n] ;
            int a = 0 ;
            int b = 1 ;
    
            for (int i=0 ; i<n ; i++) {
                if (arr[i] > 0) {
                    ans[a] = arr[i] ;
                    a += 2 ;
                } else {
                    ans[b] = arr[i] ;
                    b += 2 ;
                }
            }
            return ans ;
        }
    }
}
