public class EmptyStringCheck {
    public boolean test(){
        String x = "Hello";
        if (x.equals("")){}
        if (x.equals("Hello")){}
        var y = "world";
        return y.equals("");
    }
}
