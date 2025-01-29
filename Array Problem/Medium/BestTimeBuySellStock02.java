package Medium;

public class BestTimeBuySellStock02 {
    class Solution {
        public int maxProfit(int[] arr) {
            int n = arr.length ;
            int min = arr[0] ;
            int max = 0 ;
            int prof = 0 ;
    
            for (int i=1 ; i<n ; i++) {
                prof = arr[i] - min ;
                max = Math.max(prof , max);
                min = Math.min(arr[i] , min);
            }
            return max ;
        }
    }
}
