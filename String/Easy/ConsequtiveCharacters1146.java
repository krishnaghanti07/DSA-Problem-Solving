class Solution {
    public int maxPower(String s) {
        int count = 1 ;
        int max = 1 ;
        int n = s.length() ;
        if (n==0 || n==1) return n ;

        for (int i=1 ; i<n ; i++) {
            if (s.charAt(i)==s.charAt(i-1)) {
                count++ ;
                max = Math.max(count , max);
            } else {
                count = 1 ;
            }
        }
        return max ;
    }
}