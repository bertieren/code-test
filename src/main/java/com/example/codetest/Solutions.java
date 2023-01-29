package com.example.codetest;

import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Solutions {

    /**
     * stage 1
     *
     * @param input input param
     */
    public String removeDuplicateCharacters(String input) {

        if (Objects.isNull(input) || input.isBlank()) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        IntStream.range(0, input.length()).forEach(i -> {

            char c = input.charAt(i);
            int length = sb.length();

            if (length > 1 && c == sb.charAt(length - 1) && c == sb.charAt(length - 2)) {
                sb.delete(length - 2, length);
            } else {
                sb.append(c);
            }
        });

        return sb.toString();
    }


    /**
     * stage 2
     *
     * @param input input param
     */
    public String replaceDuplicateCharacters(String input) {

        if (Objects.isNull(input) || input.isBlank()) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        IntStream.range(0, input.length()).forEach(i -> {

            char c = input.charAt(i);

            appendChar(c, sb);

        });

        return sb.toString();
    }

    public void appendChar(char c, StringBuilder sb) {

        int length = sb.length();

        if (length > 1 && c == sb.charAt(length - 1) && c == sb.charAt(length - 2)) {

            sb.delete(length - 2, length);

            if (c > 'a') {
                appendChar((char) (c - 1), sb);
            }

        } else {
            sb.append(c);
        }
    }
    
    
    
    /**
     * RegEx solution
     */
    public static void main(String[] args) {

        String str = "aabcccbbad";

        String regex = "([a-z])\\1{2,}";

        Pattern pattern = Pattern.compile(regex);

        while (pattern.matcher(str).find()) {
            str = pattern.matcher(str).replaceAll("");

            System.out.println(str);
        }
    }
}
