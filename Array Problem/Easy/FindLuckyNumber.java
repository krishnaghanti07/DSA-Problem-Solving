public class FindLuckyNumber {
    class Solution {
        public int findLucky(int[] arr) {
            int n = arr.length ;
            int res = -1 ;
            int[] ans = new int[501] ;
            for (int i=0 ; i<n ; i++) {
                ans[arr[i]]++ ;
            }
            for (int i=1 ; i<=500 ; i++) {
                if (ans[i] == i){
                    res = Math.max(res , i);
                }
            }
            return res ;
        }
    
        // public int findLucky(int[] arr) {
        //     int n = arr.length ;
        //     Arrays.sort(arr) ;
        //     int count = 1 ;
        //     int ans = -1 ;
        //     int i=0 , j=1 ;
    
        //     while (i < n) {
        //         count = 1 ;
        //         j = i+1 ;
        //         while (j<n && arr[j]==arr[i]) {
        //             count++ ;
        //             j++ ;
        //         }
        //         if (count == arr[i]) {
        //             ans = Math.max(arr[i] , ans) ;
        //         }
        //         i = j ;
        //     }
        //     return ans ;
        // }
    }
}
