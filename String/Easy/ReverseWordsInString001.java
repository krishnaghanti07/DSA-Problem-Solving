import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString001 {
    class Solution {
    public String reverseWords(String str) {
        int n = str.length();
        str = str.trim();
        String regex = "\\s+";
        String[] myArr = str.split(regex);
        List<String> list = Arrays.asList(myArr);
        Collections.reverse(list);

        // Arrays.reverse(myArr);
        String result = String.join(" ", list);
        return result ;
    }
}
}
