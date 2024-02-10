package exercise;

import java.util.*;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> dictionary1,
                                                        Map<String, Object> dictionary2) {
        Map<String, String> result = new LinkedHashMap<>();

        Set<String> keySetDictionary2 = dictionary1.keySet();
        Set<String> keySetDictionary1 = dictionary2.keySet();

        Set<String> deletedKeys = new HashSet<>(keySetDictionary2);
        deletedKeys.removeAll(keySetDictionary1);
        deletedKeys.forEach(key -> result.put(key, "deleted"));

        Set<String> newKeys = new HashSet<>(keySetDictionary1);
        newKeys.removeAll(keySetDictionary2);
        newKeys.forEach(key -> result.put(key, "added"));

        Set<String> commonKeys = new HashSet<>(keySetDictionary2);
        commonKeys.retainAll(keySetDictionary1);
        commonKeys.forEach(key -> {
            var modify = dictionary1.get(key).equals(dictionary2.get(key)) ? "unchanged" :  "changed";
            result.put(key, modify);
        });

        return result.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldvalue, newValue) -> oldvalue, LinkedHashMap::new));

    }
}
//END
