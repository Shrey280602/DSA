import java.util.*;

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String a = "";

        for (int i = 0; i < words.size(); i++) {
            a += words.get(i).charAt(0);
        }

        return a.equals(s);
    }
}