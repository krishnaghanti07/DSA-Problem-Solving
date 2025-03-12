public class IsomorphicString002 {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()) return false ;
            char[] arr = new char[128];
    
            for (int i=0 ; i<s.length() ; i++) {
                char ch = s.charAt(i) ;
                char dh = t.charAt(i) ;
                int idx = (int) (ch) ;
                if (arr[idx] == '\0') { // '\0' --> null
                    arr[idx] = dh ;
                } else {
                    if (arr[idx] != dh) return false ;
                }
            }
            for (int i=0 ; i<128 ; i++) {
                arr[i] = '\0' ;
            }
            for (int i=0 ; i<t.length() ; i++) {
                char ch = t.charAt(i) ;
                char dh = s.charAt(i) ;
                int idx = (int) (ch) ;
                if (arr[idx] == '\0') { // '\0' --> null
                    arr[idx] = dh ;
                } else {
                    if (arr[idx] != dh) return false ;
                }
            }
            return true ;
        }
    }
    
    // if (s.length() != t.length()) return false ;
    
    //         Map<Character , Character> mpp = new HashMap<>() ;
    //         for (int i=0 ; i<s.length() ; i++) {
    //             char original = s.charAt(i) ;
    //             char replaced = t.charAt(i) ;
    
    //             if (!mpp.containsKey(original)) {
    //                 if (!mpp.containsValue(replaced)) {
    //                     mpp.put(original , replaced);
    //                 } else {
    //                     return false ;
    //                 }
    //             } else {
    //                 char res = mpp.get(original) ;
    //                 if (res != replaced) return false ;
    //             }
    //         }
    //         return true ;
}
