package Medium;
import java.util.HashSet;
import java.util.Set;

public class LongestConseqtiveSequn03 {
    class Solution {
        public int longestConsecutive(int[] arr) {
            int n = arr.length ;
            if (n == 0) {
                return 0 ;
            }
            int longest = 0 ;
    
            Set<Integer> set = new HashSet<>() ;
            for (int i=0 ; i<n ; i++) {
                set.add(arr[i]);
            }
    
            for (int ele : set) {
                if (!set.contains(ele-1)) {
                    int count = 1 ;
                    int p = ele ;
                    while (set.contains(p+1)) {
                        count++ ;
                        p += 1 ;
                    }
                    longest = Math.max(count , longest);
                }
            }
            return longest ;
        }
    }
}
