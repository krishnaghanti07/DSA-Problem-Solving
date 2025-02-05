import java.util.List;

public class FindMinimumRotationInArray001 {
    class Solution {
        public int findKRotation(List<Integer> arr) {
            // Code here
            int n = arr.size();
            int low = 0, high = n - 1;
            int ans = Integer.MAX_VALUE;
            int idx = -1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr.get(low) <= arr.get(mid)) {
                    if (arr.get(low) < ans) {
                        idx = low;
                        ans = arr.get(low);
                    }
                    low = mid + 1;
                } else {
                    if (arr.get(mid) < ans) {
                        idx = mid;
                        ans = arr.get(mid);
                    }
                    high = mid - 1;
                }
            }
            return idx;
        }
    }
}
