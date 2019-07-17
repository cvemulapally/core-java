/**
 * Created by kumarvemulapally on 8/11/17.
 */
public class Person {

    private String name;
    private String value;

    public Person(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public int hashCode(){
        return 1;
    }

    public boolean equals(Object obj){
        boolean flag = false;
         Person person = (Person) obj;
         if(person.hashCode() == hashCode())
             flag = true;

         return flag;
    }
}
