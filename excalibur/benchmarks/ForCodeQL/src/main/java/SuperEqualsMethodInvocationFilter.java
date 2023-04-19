public class SuperEqualsMethodInvocationFilter {
    public void test(){
        Object x = new Object();
        x.equals(new Object());
    }
}

class InvokingSuper extends SuperEqualsMethodInvocationFilter {
    public void test(){
        super.test();
        super.equals(new Object());
    }
}
