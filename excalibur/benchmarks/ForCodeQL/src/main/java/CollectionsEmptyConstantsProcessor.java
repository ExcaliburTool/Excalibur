import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsEmptyConstantsProcessor {
    public void test(){
        List<String> collection1 = Collections.EMPTY_LIST;          //bad
        Map<String, String> collection2 = Collections.EMPTY_MAP;    //bad
        Set<String> collection3 = Collections.EMPTY_SET;            //bad
        List<String> collection11 = Collections.emptyList();        //good
        Map<String, String> collection22 = Collections.emptyMap();  //good
        Set<String> collection33 = Collections.emptySet();          //good
    }
}
