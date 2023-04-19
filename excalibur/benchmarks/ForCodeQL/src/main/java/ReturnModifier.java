public class ReturnModifier {
    public Boolean test(){
        Boolean result = false;
        return result;  // match
    }

    public int test2(){
        return 0;   // literal
    }

    private void test3() {
        return; // void
    }

    public Object test4() {
        return null; // match
    }

    public String test5() {
        return "foo";
    }

    public boolean test6() {
        return false;
    }
}

