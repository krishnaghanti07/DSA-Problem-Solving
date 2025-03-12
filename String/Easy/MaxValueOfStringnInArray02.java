public class MaxValueOfStringnInArray02 {
    class Solution {
        public boolean isNumeric(String str) {
            for (char ch : str.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    return false ;
                }
            }
            return true ;
        }
    
        public int maximumValue(String[] strs) {
            int maxValue = 0 ;
            for (String s : strs) {
                int value ;
                if (isNumeric(s)) {
                    value = Integer.parseInt(s);
                } else {
                    value = s.length() ;
                }
                maxValue = Math.max(value , maxValue);
            }
            return maxValue ;
        }
    }
}
