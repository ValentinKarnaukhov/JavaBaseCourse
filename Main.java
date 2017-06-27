import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream=System.in;
        OutputStream outputStream=System.out;
        int a=inputStream.read();
        int b;
        while(a!=-1){
            b=inputStream.read();
            if(a==13&&b==10){
                outputStream.write(b);
                a=inputStream.read();
            }else {
                outputStream.write(a);
                a=b;
            }

        }
        outputStream.flush();
    }


}
