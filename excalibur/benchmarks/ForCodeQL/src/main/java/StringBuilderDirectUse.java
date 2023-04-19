import java.util.Locale;

public class StringBuilderDirectUse {
    public void test(){
        StringBuilder sb = new StringBuilder();
        String s = "hello";
        sb.toString().substring(0); // bad
        sb.toString().length();     // bad
        s.toString().length();      // okay
        sb.toString().toLowerCase(Locale.ROOT);
    }
}

