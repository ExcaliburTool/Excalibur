class UtilityClassWithPublicConstructorProcessor {
    public static final int SOME_CONSTANT = 42;

    public UtilityClassWithPublicConstructorProcessor() { } // should not have a public constructor
}

class NonUtilityClass {
    private int member = 42;

    public NonUtilityClass() { } // okay
}

class NonUtilityClass2 {
    private static int id = 42;
    int foo(int x) { return x + 1; }

    public NonUtilityClass2() { } // okay
}

