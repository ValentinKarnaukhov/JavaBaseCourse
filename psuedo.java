import java.util.stream.IntStream;

/**
 * Created by Valentin on 01.07.2017.
 */
public class psuedo {
    public static void main(String[] args) {
        System.out.println((123456%10000)/10);
    }


    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed,n->(((n*n)%10000)/10));
    }
}
