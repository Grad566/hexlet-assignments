package exercise;

import java.util.*;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static void main(String[] args) {
        System.out.println("Hello, Hexlet!");
    }

    public static Map<String, Integer> getWordCount(String text) {
        var textAsArray = text.split(" ");
        var result = new HashMap<String, Integer>();

        if (text.trim().isEmpty()) {
            return result;
        }

        for (var word : textAsArray) {
            var count = result.getOrDefault(word, 0);
            result.put(word, count + 1);
        }

        return result;

    }

    public static String toString(Map<String, Integer> dictionary) {
        if (dictionary.isEmpty()) {
            return "{}";
        }

        StringBuilder str = new StringBuilder();
        str.append("{\n");
        for (Map.Entry<String, Integer> word : dictionary.entrySet()) {
            str.append("  " + word.getKey() + ": " + word.getValue() + "\n");
        }

        str.append("}");

        return String.valueOf(str);
    }
}
//END
