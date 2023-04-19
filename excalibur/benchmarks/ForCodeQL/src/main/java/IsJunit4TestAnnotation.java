import org.junit.*;

public class IsJunit4TestAnnotation {
    @Before
    public void m1(){
        System.out.println("Hi");
    }

    @Test
    public void test1(){
        System.out.println("Hi");
    }

    @Test
    public void test2(){
        System.out.println("Hi");
    }

    @AfterClass
    public void m2(){
        System.out.println("Hi");
    }

    @Ignore
    public void test3(){
        System.out.println("Hi");
    }
}

