public class UseBreak {
    public static void main(String[] args) {
        int N = 23;
        int sum = 0;
        outer:
        for (int i = 0; i < N; i++) {
            int j = i + 1;
            while(true) {
                sum += i * j;
                if (sum > 100) {
                    break outer;
                }
                if (j >= N) break;
            }
        }
    }
}

