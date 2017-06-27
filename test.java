import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Created by Valentin on 27.06.2017.
 */
public class test {
    public static void main(String[] args) throws IOException {
        byte[] data={48, 49, 50, 51};
        InputStream stream=new ByteArrayInputStream(data);

        System.out.println(readAsString(stream, StandardCharsets.US_ASCII));

    }
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        String result="";
        int a;
        Reader reader=new InputStreamReader(inputStream,charset);
        while((a=reader.read())!=-1) {
            result += (char) a;
        }
        return result;
    }
}
