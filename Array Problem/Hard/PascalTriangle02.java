package Hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle02 {
    class Solution {
    public List<Integer> makeRow(int r) {
        List<Integer> list = new ArrayList<>();
        int res = 1 ;
        list.add(res) ;
        for (int i=1 ; i<r ; i++) {  // i--> column , r-->row(fixed)
            res = res*(r-i) ;
            res = res/i ;
            list.add (res) ;
        }
        return list ;
    }

    public List<List<Integer>> generate(int numRows) {
        int n = numRows ;
        List <List<Integer>> finalList = new ArrayList<>();

        for (int i=1 ; i<=n ; i++) {
            finalList.add(makeRow(i)) ;
        }
        return finalList ;
    }
}
}
