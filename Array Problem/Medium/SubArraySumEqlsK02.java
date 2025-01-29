package Medium;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqlsK02 {
    class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length ;
        int preSum = 0 ;
        int count = 0 ;
        Map<Integer, Integer> mp = new HashMap<>() ;
        mp.put(0,1) ;

        for (int i=0 ; i<n ; i++) {
            preSum += arr[i] ;
            int rem = preSum - k ;
            count += mp.getOrDefault(rem , 0) ;
            mp.put(preSum , mp.getOrDefault(preSum , 0) +1) ;
        }
        return count ;
    }
}
}
