package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static void main(String[] args) {
        System.out.println("Hello, Hexlet!");
    }

    public static boolean scrabble(String letters, String word) {
        letters = letters.toLowerCase();
        word = word.toLowerCase();
        int[] letterCount = new int[26];

        // Подсчитываем количество каждой буквы в наборе символов
        for (char letter : letters.toCharArray()) {
            if (letter >= 'a' && letter <= 'z') {
                letterCount[letter - 'a']++;
            }
        }

        // Проверяем, можно ли составить слово из набора символов
        for (char letter : word.toCharArray()) {
            if (letter >= 'a' && letter <= 'z') {
                if (letterCount[letter - 'a'] == 0) {
                    return false;
                }
                letterCount[letter - 'a']--;
            }
        }

        return true;
    }
}
//END
