
import java.security.MessageDigest;

import static java.lang.Math.abs;
//Выберите выражения, которые дадут в качестве результата строку A12
public class Hello {

    public static void main(String[] args) throws Exception {
        System.out.println( "A" +  ('\t' + '\u0003') );
        System.out.println( "A" + 12 );
        System.out.println( 'A' + "12" );
        System.out.println( 'A' + '2' + "2" );
        }

}
