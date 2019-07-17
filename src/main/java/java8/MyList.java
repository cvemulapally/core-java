package java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kumarvemulapally on 8/19/17.
 */
public class MyList {

    public List<String> arrayList = new ArrayList<>();

    public List<String> getStringList(){

        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("A");

        return arrayList;

    }
}
