package exercise;

// BEGIN
public class MaxThread extends Thread {
    private int[] nums;
    private int num;

    public MaxThread(int[] nums) {
        this.nums = nums;
        num = Integer.MIN_VALUE;
    }

    @Override
    public void run() {
        for (var i : nums) {
            if (i > num) {
                num = i;
            }
        }
    }

    public int getMaxNum() {
        return num;
    }
}
// END
