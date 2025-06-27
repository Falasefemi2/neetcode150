package com.neetcode.arrayandhashingquestions;

import java.util.ArrayList;
import java.util.List;

public class Question6 {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for (String string : strs) {
            builder.append(string.length()).append("#").append(string);
        }
        return builder.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            while (s.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(s.substring(i, j));
            String word = s.substring(j + 1, j + 1 + length);
            result.add(word);

            i = j + 1 + length;
        }
        return result;
    }
}
