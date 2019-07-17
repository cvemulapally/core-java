package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by kumarvemulapally on 8/16/17.
 */
public class set {

    Set<String> hashSet = new HashSet<>();
    Set<String> treeSet;

    public Set<String> getHashSet() {
        hashSet.add("Adam");
        hashSet.add("xxxx");
        hashSet.add("Tom");
        hashSet.add("Dan");

        return hashSet;
    }

    public Set<String> getTreeSet() {

        treeSet = new TreeSet<>(hashSet);
        return treeSet;
    }

    public static void main(String[] args){

        set instance = new set();

        System.out.println("Hash set value is : "+instance.getHashSet());
        System.out.println("Tree set value is : "+instance.getTreeSet());
    }
}
