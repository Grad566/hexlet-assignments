package exercise;

import java.util.Arrays;

// BEGIN
class App {
    public static void main(String[] args) {
        System.out.println("Hello, Hexlet!");
    }

    public static String[][] enlargeArrayImage(String[][] array) {
        if (array.length == 0 ) {
            return new String[0][0];
        }

        String[][] requiredArray = new String[array.length * 2][];
        var currentArray = 0;

        for (var element : array) {
            var shift = 0;
            requiredArray[currentArray] = new String[element.length * 2];
            for (var i = 0; i < element.length; i++) {
                requiredArray[currentArray][i + shift] = element[i];
                requiredArray[currentArray][i + 1 + shift] = element[i];
            }
            requiredArray[currentArray + 1] = requiredArray[currentArray];
            currentArray += 2;
        }

        return requiredArray;
    }
}
// END
