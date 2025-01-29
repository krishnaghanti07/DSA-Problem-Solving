package Easy;
public class MoveZeros01 {
    class Solution {
        public void moveZeroes(int[] arr) {
            int n = arr.length ;
            if (n <= 1) return ;
            int i = 0 ;
            int j = 0 ;
    
            while (j < n) {
                if (arr[j] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ;
                    i++ ;
                }
                j++ ;
            }
            return ;
        }
    }
}
