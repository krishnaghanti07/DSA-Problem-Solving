public class RemoveOutmostParenthesis03 {
    class Solution {
        public String removeOuterParentheses(String str) {
            int n = str.length();
            int counter = 0 ;
            String ans = "" ;
    
            for (int i=0 ; i<n ; i++) {
                if (str.charAt(i) == ')') counter-- ;
                if (counter > 0) ans += str.charAt(i) ;
                if (str.charAt(i) == '(') counter++ ;
            }
            return ans ;
        }
    }
}
