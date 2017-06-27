import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Valentin on 27.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream= System.in;
        PrintStream outputStream=System.out;
        Scanner scanner=new Scanner(inputStream);
        Double res=0.0;
        while(scanner.hasNext()){
            try {
                res+=Double.parseDouble(scanner.next());
            }catch (Exception e){}
        }
        outputStream.printf("%.6f",res);
        outputStream.flush();

    }

}
