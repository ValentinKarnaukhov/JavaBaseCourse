import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Valentin on 21.06.2017.
 */
public class Whocallmy {

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }



    public static String getCallerClassAndMethodName(){

        StackTraceElement[] ste = new Exception().getStackTrace();
        if (ste.length < 3 ) {
            return null;
        } else {
            return ste[2].getClassName()+"#"+ste[2].getMethodName();
        }
    }
}
