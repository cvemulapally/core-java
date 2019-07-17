package java8.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PersonMain {

    public static List<Person> personInItems(List<Person> originalList, List<Person> newList){

        List<Person> unionList = new ArrayList<>();

        originalList.forEach(person ->
                newList.stream().
                filter(person1 -> person1.getFname().equals(person.getFname())).
                forEach(unionList :: add));

        return unionList;
    }

    public static List<Person> replaceNewPersonInOriginalListUsingStreams(List<Person> originalList, List<Person> newList){

        List<Person> personsToRemoveFromOriginalList = new ArrayList<>();

        originalList.forEach(person ->
                newList.stream().
                        filter(person1 -> person1.getFname().equals(person.getFname())).
                        forEach(personsToRemoveFromOriginalList :: add));

        originalList.removeAll(personsToRemoveFromOriginalList);
        originalList.addAll(newList);

        return originalList;
    }


    public static List<Person> replaceNewPersonInOriginalList(List<Person> originalList, List<Person> newList){

        List<Person> personsToRemoveFromOriginalList = new ArrayList<>();

        for (Person originalPerson : originalList){
            for(Person newPerson : newList){
                if(originalPerson.getFname().equals(newPerson.getFname())){
                    personsToRemoveFromOriginalList.add(originalPerson);
                }
            }
        }

        originalList.removeAll(personsToRemoveFromOriginalList);
        originalList.addAll(newList);

        return originalList;
    }


    public static void main(String[] args){

        List<Person> originalList = new ArrayList<>();
        List<Person> newList = new ArrayList<>();

        originalList.add(new Person("1", "12"));
        originalList.add(new Person("2", "123"));
        originalList.add(new Person("3", "1234"));
        originalList.add(new Person("4", "12345"));
        newList.add(new Person("1", "12123456"));

        List<Person> commonPersonsList = personInItems(originalList, newList);

        List<Person> combinedList = replaceNewPersonInOriginalList(originalList, newList);
        List<Person> combinedListUsingStreams = replaceNewPersonInOriginalListUsingStreams(originalList, newList);

        System.out.println("commonPersonsList size : "+commonPersonsList.size());
        System.out.println("combined list without duplicates size : "+combinedList.size());
        System.out.println("combined list without duplicates size using streams: "+combinedListUsingStreams.size());


    }
}
