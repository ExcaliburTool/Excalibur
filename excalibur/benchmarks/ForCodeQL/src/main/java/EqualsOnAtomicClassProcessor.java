import java.util.concurrent.atomic.AtomicInteger;

public class EqualsOnAtomicClassProcessor {
    void foo() {
        AtomicInteger aInt1 = new AtomicInteger(0);
        AtomicInteger aInt2 = new AtomicInteger(0);
        boolean isEqual = aInt1.equals(aInt2); // Noncompliant
        isEqual = aInt2.equals(aInt1);
        isEqual = aInt1.get() == aInt2.get(); // desired form
        Integer a = 0;
        Integer b = 0;
        isEqual = a.equals(b);
    }
}
