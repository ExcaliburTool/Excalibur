public class MathOnFloatProcessor {
    public void test(){
        float a = 16777216.0f;
        float b = 1.0f;
        float c1 = a + b; // Noncompliant, yields 1.6777216E7 not 1.6777217E7 -> float c1 = (double) a + (double) b;
        double c = 2.33;
        double c2 = c * 3.9;
        float e = a * (float) c;
        System.out.println(a);
    }
}

