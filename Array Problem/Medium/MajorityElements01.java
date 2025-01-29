package Medium;

public class MajorityElements01 {
    class Solution {
        public int majorityElement(int[] arr) {
            int n = arr.length ;
            int maj = arr[0] ;
            int count = 1 ;
    
            for (int i=1 ; i<n ; i++) {
                if (arr[i] == maj) {
                    count++ ;
                } else {
                    count-- ;
                    if (count == 0) {
                        maj = arr[i+1] ;
                    }
                }
            }
            return maj ;
        }
    }
}
