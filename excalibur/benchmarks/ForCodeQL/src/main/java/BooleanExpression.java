public class BooleanExpression {
    public void compare(int i){
        boolean test1 = false;
        int test2 = 5;

        if (test1 == true){
            System.out.println("this would trigger transformation");
        }
        if (test1){
            System.out.println("this would not trigger transformation");
        }
        if (test1 == false){
            System.out.println("this would trigger transformation");
        }
        if (!test1){
            System.out.println("this would not trigger transformation");
        }
        if (test2 < 10){
            System.out.println("this would not trigger transformation");
        }
        if (test2 > 0){
            System.out.println("this would not trigger transformation");
        }
        if (test2 == 5){
            System.out.println("this would not trigger transformation");
        }
    }
}
