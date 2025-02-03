package Hard;

import java.util.ArrayList;
import java.util.List;

public class ReversePairs009 {
    class Solution {
        public void merge(int[] arr, int low, int mid, int high) {
            int n = arr.length;
            List<Integer> ans = new ArrayList<>();
            int i = low;
            int j = mid + 1;

            while (i <= mid && j <= high) {
                if (arr[i] < arr[j]) {
                    ans.add(arr[i]);
                    i++;
                } else {
                    ans.add(arr[j]);
                    j++;
                }
            }
            while (i <= mid) {
                ans.add(arr[i]);
                i++;
            }
            while (j <= high) {
                ans.add(arr[j]);
                j++;
            }

            for (int idx = 0; idx < ans.size(); idx++) {
                arr[idx + low] = ans.get(idx);
            }
        }

        public int countPairs(int[] arr, int low, int mid, int high) {
            int count = 0;
            int right = mid + 1;
            for (int i = low; i <= mid; i++) {
                while (right <= high && (long) arr[i] > (long) 2 * arr[right])
                    right++;
                count += (right - (mid + 1));
            }
            return count;
        }

        public int mergeSort(int[] arr, int low, int high) {
            if (low >= high)
                return 0;
            int count = 0;
            int mid = low + (high - low) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += countPairs(arr, low, mid, high);
            merge(arr, low, mid, high);
            return count;
        }

        public int reversePairs(int[] arr) {
            int n = arr.length;
            if (arr == null || arr.length == 0)
                return 0;
            return mergeSort(arr, 0, n - 1);
        }
    }
}
