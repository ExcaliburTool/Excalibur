public class PrimitiveTypeEqualsBinaryOperatorFilter {
    public void compare(int i){
        boolean test1 = false;
        int test2 = 5;
        var test3 = "str";

        var y0 = test1 == true;
        var n0 = test1;
        var y1 = test1 == false;
        var n1 = !test1;
        var n2 = test3 == "";
        var n3 = test2 < 10;
        var n4 = test2 > 0;
        var y2 = test2 == 5;
    }
}
