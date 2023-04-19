public class FieldModifier {
    Boolean var1 = false;
    FMA obj = new FMA(1);  // bad -> not null object field
    FMA obj2 = null;
}

class FMA {
    int x;
    FMA (int x) {
        x = x;
    }
}

