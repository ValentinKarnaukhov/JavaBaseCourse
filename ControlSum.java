import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Valentin on 26.06.2017.
 */
public class ControlSum {
    public static void main(String[] args) throws IOException {
        byte[] data={0x33,0x45, 0x01};
        InputStream stream=new ByteArrayInputStream(data);
        System.out.println((int) 0x33);
        System.out.println(checkSumOfStream(stream));
    }
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int a=inputStream.read();
        while (a != -1) {
            sum=Integer.rotateLeft(sum,1)^a;
            a=inputStream.read();
        }

        return sum;

    }
}
