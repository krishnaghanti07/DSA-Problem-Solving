public class LcmAndGcd {
    
    class Solution {
    
        public static int calGcd (int a , int b) {
            if (b == 0) return a ;
            return calGcd(b , a%b) ;
        }
        
        public static int[] lcmAndGcd(int a, int b) {
            // code here
            int gcd = calGcd (a , b) ;
            int lcm = (a*b)/gcd ;
            
            int[] ans = new int[2] ;
            ans[0] = lcm ;
            ans[1] = gcd ;
            
            return ans ;
        }
    }
}
