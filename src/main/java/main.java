import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class main {

    public static void main(String[] args){

//        String xmlTag = "<test 123:4.ljl> wew </>";
//
//        String out1 = xmlTag.replaceAll(">\\s+<", "><");
//
//        System.out.println(out1);

//        String test1 = "<tag>test 1</tag>    <tag>test 2</tag> ";
//        String test2 = "< tag   232e2 >test 1</tag>";
//
//        String out1 = test1.replaceAll(">\\s+<", "><");
//        System.out.println(test1);
//        System.out.println(out1);



        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        AtomicInteger ordinal = new AtomicInteger(0);

        list.forEach( elem -> {
            int andIncrement = ordinal.getAndIncrement();
        });
        System.out.println(ordinal.get());

    }
}
