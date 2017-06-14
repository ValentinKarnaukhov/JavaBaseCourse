
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
//Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
import static java.lang.Math.abs;

public class Hello {

    public static void main(String[] args) throws Exception {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2};

        System.out.println(Arrays.toString()));


    }

    public static int[] pali(int[] a, int[] b) {
        int len = a.length + b.length;
        int[] res = new int[len];
        int countera = 0;
        int counterb = 0;
        int v=0;
        for (int i = 0; i < len; i++) {
            if(a[countera]<b[counterb]) {
                res[i] = a[countera];
                if(countera+1==a.length) {
                    i++;
                    for(int j=counterb;j<b.length;j++){
                        res[i]=b[j];
                        i++;
                    }
                    break;
                }
                countera++;
            }else{
                res[i] = b[counterb];
                if(counterb+1==b.length){
                    i++;
                    for(int j=countera;j<a.length;j++){
                        res[i]=a[j];
                        i++;
                    }
                    break;
                }

                counterb++;
            }

        }


        return res;
    }
}