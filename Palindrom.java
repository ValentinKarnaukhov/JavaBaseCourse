
import java.security.MessageDigest;
//Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
import static java.lang.Math.abs;

public class Hello {

    public static void main(String[] args) throws Exception {
        System.out.println(pali("Madam, I'm Adam!"));

        }
    public static boolean pali(String text){
        String replaced = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuffer(replaced).reverse().toString();
        return reversed.equals(replaced);

    }
}
