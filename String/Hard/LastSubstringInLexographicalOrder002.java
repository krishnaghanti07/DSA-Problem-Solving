// package String.Hard;

public class LastSubstringInLexographicalOrder002 {
    public String lastSubstring(String str) {
        int n = str.length();
       int i = 0; // The start of the best suffix found so far
       int j = 1; // The new candidate suffix
       int k = 0; // Offset for comparing suffixes
       char arr[]= str.toCharArray();
       while (j + k < n) {
           if (arr[i + k] == arr[j + k]) {
               k++; // Move forward if characters are the same
           } else if (arr[i + k] < arr[j + k]) {
               // If the new candidate `j` is better, update `i`
               i = Math.max(i+k+1,j);
               j = i + 1;
               k = 0; // Reset comparison
           } else {
               // If the old candidate `i` is still better, skip ahead
               j += k + 1;
               k = 0;
           }
       }

       return str.substring(i);
   }
}
