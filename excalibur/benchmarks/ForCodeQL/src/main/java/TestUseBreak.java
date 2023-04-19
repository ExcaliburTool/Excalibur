class TestUseBreak {
    int foo(int a) {
        int sum = 0;
        int i;
        outer:
        for (i = 0; i < a; i++) {
            int j = 0;
            while (true) {
                if (j > i) break;
                j++;
                sum += j;
                if (sum > 10000) break outer;
            }
        }
        return i;
    }
}
