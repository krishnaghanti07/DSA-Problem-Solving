package Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals003 {
    class Solution {
        public static int[][] merge(int[][] arr) {
            int n = arr.length;
            // Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
            Arrays.sort(arr, new Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    return a[0] - b[0];
                }
            }); // Creating a List<int[]>
            List<int[]> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1)[1]) { // if ans is empty or non-overlpping
                    ans.add(new int[] { arr[i][0], arr[i][1] });
                } else { // if overlapping happens
                    ans.get(ans.size() - 1)[1] = Math.max(arr[i][1], ans.get(ans.size() - 1)[1]);
                }
            } // Converting List<int[]> into int[][]
            return ans.toArray(new int[ans.size()][]);
        }
    }

}
