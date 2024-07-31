package exercise;

// BEGIN
public class MinThread extends Thread {
    private int[] nums;
    private int num;

    public MinThread(int[] nums) {
        this.nums = nums;
        num = Integer.MAX_VALUE;
    }

    @Override
    public void run() {
        for (var i : nums) {
            if (i < num) {
                num = i;
            }
        }
    }

    public int getMinNum() {
        return num;
    }
}
// END
