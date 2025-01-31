package Hard;

import java.util.ArrayList;
import java.util.List;

public class CountInversion02 {
    class Solution {
        static int merge(int[] arr, int st, int mid, int end) {
            int n = arr.length;
            List<Integer> temp = new ArrayList<>();
            int i = st;
            int j = mid + 1;
            int invCount = 0;

            while (i <= mid && j <= end) {
                if (arr[i] <= arr[j]) {
                    temp.add(arr[i]);
                    i++;
                } else {
                    invCount += (mid - i + 1);
                    temp.add(arr[j]);
                    j++;
                }
            }

            while (i <= mid) {
                temp.add(arr[i]);
                i++;
            }

            while (j <= end) {
                temp.add(arr[j]);
                j++;
            }

            for (int idx = 0; idx < temp.size(); idx++) {
                arr[idx + st] = temp.get(idx);
            }

            return invCount;
        }

        static int mergeSort(int[] arr, int st, int end) {
            if (st < end) {
                int n = arr.length;
                int mid = st + (end - st) / 2;

                int leftCount = mergeSort(arr, st, mid);
                int rightCount = mergeSort(arr, mid + 1, end);
                int invCount = merge(arr, st, mid, end);

                return leftCount + rightCount + invCount;
            }
            return 0;
        }

        // Function to count inversions in the array.
        static int inversionCount(int arr[]) {
            // Your Code Here
            int n = arr.length;
            int ans = mergeSort(arr, 0, n - 1);
            return ans;
        }
    }
}
