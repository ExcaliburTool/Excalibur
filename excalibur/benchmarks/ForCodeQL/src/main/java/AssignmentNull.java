public class AssignmentNull {
    public void test(){
        int x = 0;
        Integer y = null;
        boolean w = false;
        Boolean z = null;
        x = 2;
        y = 2;
        w = true;
        z = true;

        w = (Boolean) null;
        z = null;
        Object[] os;
        os = new Object[] { null };
    }
}

