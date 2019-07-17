
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ComparatorTest {

    public List<String> getStringList() {
        List<String> list = new ArrayList<>();
        list.add("Chaitu");
        list.add("Akhila");
        list.add("Rishi");

        return list;
    }

    public static void main(String[] args){

        ComparatorTest comparatorTest = new ComparatorTest();
        List<String> stringList = comparatorTest.getStringList();
        stringList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        System.out.print("list : "+stringList);
    }
}
