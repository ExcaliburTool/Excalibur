public class MutualRecursive {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static int f(int n) {
        if (n == 0) {
            return 0;
        } else {
            return g(n - 1);
        }
    }

    public static int g(int n) {
        if (n == 0) {
            return 1;
        } else {
            return f(n - 1);
        }
    }

    double u(int n, double acc) {
        if (n == 0) return acc;
        return v(n - 1, acc + 1.0 / n);
    }

    double v(int n, double acc) {
        if (n == 0) return acc;
        return u(n - 1, acc + 2.0 / n);
    }
}

