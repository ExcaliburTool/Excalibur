public class DeadStoreProcessor {
    public void dead()
    {
        int x=5;
        int y=10;
        int z;
        y=x*x*y;
        System.out.println(y);
        x=7;    // useless assignment
        y=8;   //  useless assignment
        z=9;   //  useless assignment
    }
}
