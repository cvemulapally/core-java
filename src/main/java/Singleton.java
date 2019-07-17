/**
 * Created by kumarvemulapally on 8/12/17.
 */
public class Singleton {

    public static Singleton mySingleton;

    public Singleton() {


    }

    public static Singleton getInstance() {

        if(mySingleton == null){
            mySingleton = new Singleton();
        }

        return mySingleton;

    }


}
