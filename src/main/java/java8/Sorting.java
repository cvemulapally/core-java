package java8;


import java.util.Collections;
import java.util.List;

/**
 * Created by kumarvemulapally on 8/19/17.
 */
public class Sorting {

    private static List<String> stringList;

    public static void main(String[] args){

        Integer i = 10;

        int a = i;

        Integer b=a;

        MyList list = new MyList();
//        Collections.sort(list.getStringList(), new Comparator<String>(){
//
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.compareTo(s2);
//            }
//        });

        stringList = list.getStringList();
        Collections.sort(stringList, (s1, s2) -> s1.compareTo(s2));

        System.out.print("sorted list : "+stringList);


   }
}
