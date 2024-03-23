package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage map) {
        var swappedMap = new HashMap<String, String>();

        for (Map.Entry<String, String> entry : map.toMap().entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }

        for (Map.Entry<String, String> entry : swappedMap.entrySet()) {
            map.unset(entry.getValue());
        }

        for (Map.Entry<String, String> entry : swappedMap.entrySet()) {
            map.set(entry.getKey(), entry.getValue());
        }
    }
}
// END
