import java.math.BigDecimal;

public class BigDecimalDoubleConstructorProcessor {
    public void test(){
        double d = 1.1;
        float f = 2.2f;
        BigDecimal bd1 = new BigDecimal(d);  // bad
        BigDecimal bd2 = new BigDecimal(1.1);  // bad
        BigDecimal bd3 = new BigDecimal(f);  // bad
        BigDecimal bd4 = BigDecimal.valueOf(d); // good
        BigDecimal bd5 = BigDecimal.valueOf(1.1); // good
    }
}
