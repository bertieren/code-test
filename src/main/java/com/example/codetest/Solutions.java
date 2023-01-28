package com.example.codetest;

import java.util.LinkedList;
import java.util.Objects;
import java.util.stream.Collectors;
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

        LinkedList<Character> list = new LinkedList<>();

        IntStream.range(0, input.length()).forEach(i -> {

            list.add(input.charAt(i));

            int size = list.size();
            if (size > 2) {
                if (list.get(size - 1) == list.get(size - 2) && list.get(size - 2) == list.get(size - 3)) {
                    list.removeLast();
                    list.removeLast();
                    list.removeLast();
                }
            }
        });

        return list.stream().map(Object::toString).collect(Collectors.joining());
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

        LinkedList<Character> list = new LinkedList<>();

        IntStream.range(0, input.length()).forEach(i -> {

            list.add(input.charAt(i));

            replaceDuplicateCharacters(list);
        });

        return list.stream().map(Object::toString).collect(Collectors.joining());
    }

    public void replaceDuplicateCharacters(LinkedList<Character> list) {

        int size = list.size();

        if (size > 2) {
            Character duplicatedChar = list.get(size - 2);

            if (list.get(size - 1) == duplicatedChar && duplicatedChar == list.get(size - 3)) {
                list.removeLast();
                list.removeLast();
                list.removeLast();

                if (duplicatedChar > 'a') {
                    list.add((char) (duplicatedChar - 1));
                }

                replaceDuplicateCharacters(list);
            }
        }
    }
}
