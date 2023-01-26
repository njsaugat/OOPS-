package week7;

import java.util.ArrayList;
import java.util.List;

class Alphabet {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");

        words.sort((a, b) -> a.compareTo(b));

        System.out.println(words);
    }
}