// package String.Easy.Reverse Words in a String;

public class ReverseWordsInaString002 {
    class Solution {
        public void reverse(StringBuilder sb , int i , int j) {
            while (i < j) {
                char temp = sb.charAt(i) ;
                sb.setCharAt(i , sb.charAt(j));
                sb.setCharAt(j , temp) ;
                i++; j--;
            }
        }
    
        public String reverseWords(String s) {
            int n = s.length() ;
            StringBuilder sb = new StringBuilder(s) ;
            int i=0 , j=0 ;
            
            while (j < n) {
                if (sb.charAt(j) != ' ') j++ ;
                else {
                    reverse(sb , i , j-1);
                    i = j+1 ;
                    j = i ;
                }
            }
            reverse(sb , i , j-1);
            return sb.toString();
        }
    }
}
