public class UnsafeCasts {
    public static void main(String[] args) {
        float f = 1.0f;
        int i = (int) f;
        System.out.println(i);
        var d = (int) 3.24f;
    }
}

