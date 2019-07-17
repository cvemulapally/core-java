package exceptions;

/**
 * Created by kumarvemulapally on 8/16/17.
 */
public class exception {


    public static void main(String[] args){

        System.gc();

        try {
            System.out.println("Inside try block");
            throw new IllegalAccessException();
        } catch (Exception e) {
            System.out.println("Inside catch block");
            throw new IndexOutOfBoundsException();
        } finally {
            System.out.println("Inside finally block");
        }
    }
}
