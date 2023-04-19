class TestEqBooleanConsts {
    int foo(int a) {
        if ((a % 2 == 0) == true) {
            return 1;
        }
        return 0;
    }
}
