public class StaticAccessThroughInstance {
    public static void main (String[] args){
        var obj = new SATI();
        obj.test(); //static methods are not accessed through class name
        SATI.test();
        var obj2 = new SATI2();
        obj2.test();
    }
}

class SATI {
    public static void test() {
        System.out.println("Hi");
    }
}

class SATI2 {
    static void test() {}
}

