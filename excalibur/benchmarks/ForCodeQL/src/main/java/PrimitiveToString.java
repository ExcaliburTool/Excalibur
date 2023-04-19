public class PrimitiveToString {
    public void test() {
        String x = "a" + 3; //target
        String y = 3 + "b"; //target
        String z = "c" + false; //target

        var n0 = x + "d";
        var n1 = 3+1; //nothing happens
        var n2 = n1+2; //nothing happens
    }
}
