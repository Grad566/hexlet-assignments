package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static void main(String[] args) {
        System.out.println("Hello, Hexlet!");
    }

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> words) {
        var sizeWords = words.values().size();
        var wordsValues = words.values();
        var result = new ArrayList<Map<String, String>>();

        for (var book : books) {
            var bookValues = book.values();
            var matches = 0;

            for (var element : bookValues) {
                if (wordsValues.contains(element)) {
                    matches++;

                    if (matches == sizeWords) {
                        result.add(book);
                    }
                }
            }
        }

        return result;
    }
}
//END
