package exercise;

// BEGIN
public class ReversedSequence implements  CharSequence {
    private String str;

    public ReversedSequence (String str) {
        this.str = reverseString(str);
    }

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public char charAt(int index) {
        return str.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end > str.length() || start > end) {
            throw new IndexOutOfBoundsException();
        }

        String sub = str.substring(start, end);
        return new ReversedSequence(sub);
    }

    private String reverseString(String text) {
        StringBuilder result = new StringBuilder();

        for (var i = text.length() - 1; i >= 0; i--) {
            var temp = text.charAt(i);
            result.append(temp);
        }

        return  result.toString();
    }
}
// END
