public class CompareToReturnValueProcessor {
    public int compareTo(int a) {
        return Integer.MIN_VALUE; // bad
    }
    public int compareTo2(int a) {
        return -1; // good
    }
    public int compareTo3(int a) {
        if (a > 0)
            return Integer.MIN_VALUE; // bad
        else
            return -1; // good
    }
}
