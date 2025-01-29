package Medium;

import java.util.ArrayList;
import java.util.List;

public class Spiralmatrix02 {
    
    class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length ;
        int n = matrix[0].length ;
        ArrayList<Integer> arr = new ArrayList<>() ;
        int tr=0 , br=m-1 , lc=0 , rc=n-1 ;

        while (tr<=br && lc<=rc) {
            for (int i=lc ; i<=rc ; i++) {
                arr.add(matrix[tr][i]);
            }
            tr++ ;
            for (int i=tr ; i<=br ; i++) {
                arr.add(matrix[i][rc]);
            }
            rc-- ;
            if (tr <= br) {
                for (int i=rc ; i>=lc ; i--) {
                    arr.add(matrix[br][i]);
                }
                br-- ;
            }
            if (lc <= rc) {
                for (int i=br ; i>=tr ; i--) {
                    arr.add(matrix[i][lc]);
                }
                lc++ ;
            }
        }
        return arr ;
    }
}
}
