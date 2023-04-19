import java.util.ArrayList;
import java.util.List;

public class LoopHeadElement {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        int x = 0;
        while (x < 3) {                                    // while-loop head: x<3
            ++x;
            System.out.println(x);
        }

        for (var y: args) {                             // for-each loop head
            System.out.println(y);
        }
    }
}
