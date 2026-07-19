import java.util.*;

class Solution {
    String reverseWords(String s) {

        String[] words = s.split("\\.");
        String ans = "";

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals("")) {
                if (ans.length() == 0)
                    ans = words[i];
                else
                    ans = ans + "." + words[i];
            }
        }

        return ans;
    }
}
