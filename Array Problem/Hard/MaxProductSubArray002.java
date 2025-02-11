package Hard;

public class MaxProductSubArray002 {
    class Solution {
        public int maxProduct(int[] arr) {
            int n = arr.length ;
            int pref=1 , suff=1 ;
            int maxi = Integer.MIN_VALUE ;
    
            for (int i=0 ; i<n ; i++) {
                if (pref == 0) pref=1 ;
                if (suff == 0) suff=1 ;
    
                pref = pref*arr[i] ;
                suff = suff*arr[n-i-1] ;
    
                maxi = Math.max(maxi , Math.max(pref , suff));
            }
            return maxi ;
        }
    }
}
