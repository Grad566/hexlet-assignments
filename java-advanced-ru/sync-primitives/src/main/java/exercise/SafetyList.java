package exercise;

class SafetyList {
    // BEGIN
    private int[] array;
    private int index;

    public SafetyList() {
        index = 0;
        array = new int[1000];
    }

    public synchronized void add(int num) {
        if (index == array.length -1) {
            reSize();
        }
        array[index++] = num;
    }

    public int get(int i) {
        return array[i];
    }

    public int getSize() {
        return index;
    }

    private void reSize() {
        var currentSize = array.length;
        var newArray = new int[currentSize * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
    // END
}
