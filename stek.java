
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class stek {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        OutputStream outputStream=System.out;
        Deque<Integer> stek=new ArrayDeque<>();
        int s=0;
        while(scanner.hasNext()){
            if(s++%2!=0)stek.addLast(scanner.nextInt());
            else scanner.nextInt();
        }
        while(stek.size()!=0){
            System.out.print(stek.pollLast().toString()+"");
        }
        outputStream.flush();

    }
}
