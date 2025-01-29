class Solution {
    public int reverse(int n) {
        int ans = 0;

        while (n != 0) {
            if ((ans > (Integer.MAX_VALUE/10)) || (ans < (Integer.MIN_VALUE/10))) {
                return 0 ;
            }
            int digit = n%10 ;
            ans = (ans*10) + digit ;
            n = n/10 ;
        }

        return ans ;
    }
}

// int ans = 0 ;

//         while (x != 0) {
//             if ((ans > (Integer.MAX_VALUE/10)) || (ans < (Integer.MIN_VALUE/10))) {
//                 return 0 ;
//             }
//             ans = (ans*10) + (x % 10) ;
//             x /= 10 ;
//         }
//         return ans ;