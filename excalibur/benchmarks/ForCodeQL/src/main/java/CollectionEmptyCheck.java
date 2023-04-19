import java.util.ArrayList;

public class CollectionEmptyCheck {
    public void test(){
        ArrayList<Integer> x = new ArrayList<>();
        var y = x;
        x.add(1);
        x.add(2);
        x.add(3);
        if (x.isEmpty()){
            System.out.println("good");
        }
        x.add(4);
        if (x.size() == 3){
            System.out.println("good");
        }
        if (x.size() == 0){
            System.out.println("bad");
        }
        System.out.println(y.size() == 0);
    }
}
