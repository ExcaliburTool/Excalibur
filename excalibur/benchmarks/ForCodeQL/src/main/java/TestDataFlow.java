class TestDataFlow {
    int foo(int a, int b) {
        int c = a > 0 ? a + 1 : b + 1;
        return c;
    }

    int bar(int a, int b) {
        int c = 0;
        if (a > 0) {
            c = a + 1;
        } else {
            c = b + 1;
        }
        int d = c - 1;
        return d;
    }

    void baz() {
        return;
    }
}

