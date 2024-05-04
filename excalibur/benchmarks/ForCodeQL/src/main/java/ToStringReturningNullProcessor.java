import java.util.Random;

public class ToStringReturningNullProcessor {
    public int val;

    public String toString() {
        if (val == 0) {
            return null; // Noncompliant
        } else {
            return "" + val;
        }
    }

    public Object foo() { return null; }
}

class ToStringNotReturningNull {
    public String toString() {
        return "";
    }
}

