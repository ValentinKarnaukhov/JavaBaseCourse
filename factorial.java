
import java.math.BigInteger;
import java.security.MessageDigest;
//Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
import static java.lang.Math.abs;

public class Hello {

    public static void main(String[] args) throws Exception {
        System.out.println(pali(10));

        }
    public static BigInteger pali(int a){
        BigInteger res=BigInteger.ONE;
        for(int i=1;i<=a;i++){
            res=res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
