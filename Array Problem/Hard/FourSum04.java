package Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum04 {
    class Solution {
        public List<List<Integer>> fourSum(int[] arr, int target) {
            int n = arr.length;
            Arrays.sort(arr);
            List<List<Integer>> ans = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (i != 0 && arr[i] == arr[i - 1])
                    continue;

                for (int j = i + 1; j < n; j++) {
                    if (j != i + 1 && arr[j] == arr[j - 1])
                        continue;

                    int l = j + 1;
                    int k = n - 1;

                    while (l < k) {
                        long sum = (long) arr[i] + (long) arr[j] + (long) arr[k] + (long) arr[l];

                        if (sum == target) {
                            List<Integer> nums = Arrays.asList(arr[i], arr[j], arr[l], arr[k]);
                            ans.add(nums);
                            l++;
                            k--;
                            while (l < k && arr[l] == arr[l - 1])
                                l++;
                            while (l < k && arr[k] == arr[k + 1])
                                k--;

                        } else if (sum > target) {
                            k--;
                        } else {
                            l++;
                        }
                    }
                }
            }
            return ans;
        }
    }
}
