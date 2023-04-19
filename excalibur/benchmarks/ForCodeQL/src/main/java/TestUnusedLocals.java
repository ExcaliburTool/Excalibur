class TestUnusedLocals {
    int foo(int i) {
        int a = 1;
        int b = 2;
        if (a < i) return i;
        return 0;
    }
}
