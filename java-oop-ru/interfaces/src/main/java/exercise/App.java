package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int count) {
        var result =new ArrayList<String>();

        List<String> sortedHomes = homes.stream()
                .sorted(Comparator.comparingDouble(Home::getArea))
                .map(Home::toString)
                .toList();

        for (var i = 0; (i < count) && i < sortedHomes.size(); i++) {
            result.add(sortedHomes.get(i));
        }

        return result;
    }
}
// END
