/**
 * Created by kumarvemulapally on 8/11/17.
 */
public class Hash {

    public static void main(String[] args){

//        Person p1 = new Person("Chaitu", "one");
//        Person p2 = new Person("Akhila","two");
//
//        Map<Person, String> map = new HashMap<>();
//
//        Map<Person, String> table = new Hashtable<>();
//
//        map.put(null, "");
//        map.put(null, "");
//
//        map.put(p1,"P1");
//        map.put(p2,"P2");
//
//        Iterator<Map.Entry<Person, String>> iterator = map.entrySet().iterator();
//
//        while (iterator.hasNext()){
//
//            System.out.println(iterator.toString());
//        }
//
//        for (Map.Entry<Person, String > loop: map.entrySet()) {
//
//            System.out.println("testing map null keys : "+loop.toString());
//
//        }

//        while (iterator.hasNext()){
//            System.out.println(map.get(p1));
//        }

//        System.out.println(map.size());
//        System.out.println("P1 hash code : "+p1.hashCode());
//        System.out.println("P2 hash code : "+p2.hashCode());
//
//        boolean equals = p1.equals(p2);
//
//        System.out.println("testing equals : "+equals);

//        System.out.println("testing map null keys : "+map.entrySet().toString());


        Singleton singleton1 = Singleton.getInstance();
        System.out.println("instance value is : "+singleton1);



    }
}
