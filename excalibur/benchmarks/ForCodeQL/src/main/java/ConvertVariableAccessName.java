package ConvertVariableAccessName;

import java.util.ArrayList;

public class ConvertVariableAccessName {
    ArrayList<Integer> as = new ArrayList<>();
    int each;   //reserve word
    int with;   //reserve word
    int get;    //reserve word
    int set;    //reserve word
    int hello;  //non-reserve word
    int world;  //non-reserve word

    public void setNumber(int i){
        as.add(i);  //reserve word
        each = i;   //reserve word
        hello = i;  //non-reserve word
        with = i;   //reserve word
        world = i;  //non-reserve word
        set = i;    //reserve word
        get = i;    //reserve word
    }
}
