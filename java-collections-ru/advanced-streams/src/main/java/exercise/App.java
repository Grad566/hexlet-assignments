package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String getForwardedVariables(String file) {
        String[] fileAsArray = file.split("]");

        return Arrays.stream(fileAsArray)
                .filter(elements -> elements.trim().startsWith("environment"))
                .map(words -> words.split("\""))
                .flatMap(Stream::of)
                .map(words -> words.split(","))
                .flatMap(Stream::of)
                .filter(item -> item.startsWith("X_FORWARDED_"))
                .map(element -> element.substring(12))
                .collect(Collectors.joining(","));
    }
}
//END
