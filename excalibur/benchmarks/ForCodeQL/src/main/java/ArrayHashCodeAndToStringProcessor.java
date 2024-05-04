import java.util.Arrays;

public class ArrayHashCodeAndToStringProcessor {
    public void test(){
        int[] args = {1,2,3};
        String argStr1 = args.toString();// Noncompliant
        int argHash1 = args.hashCode();// Noncompliant
        String argStr2 = Arrays.toString(args);
        int argHash2 = Arrays.hashCode(args);
        Integer i = 42;
        String nonArrStr = i.toString();
        int nonArrHash = i.hashCode();
    }
}

