public class IsNullCondition {
    public void test(){
        Boolean flag = false;
        Integer x = 0;
        if (flag == null){} // bad
        if (null == null){} // bad
        if (flag == false){}
        if (x == null){} // bad
        if (null == x){} // bad
        if (x == 0){}
    }
}

