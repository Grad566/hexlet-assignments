package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.logging.Level;

class App {
    private static final Logger LOGGER = Logger.getLogger("AppLogger");

    // BEGIN
    public static Map<String, Integer> getMinMax(int[] nums) {
        var maxThread = new MaxThread(nums);
        var minThread = new MinThread(nums);
        maxThread.start();
        minThread.start();

        try {
            minThread.join();
            maxThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new HashMap<>(Map.of(
                "min", minThread.getMinNum(),
                "max", maxThread.getMaxNum()
        ));
    }
    // END
}
