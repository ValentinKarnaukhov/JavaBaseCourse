
import java.util.function.DoubleUnaryOperator;


public class Main {
    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));//0.603848






    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double res=0;
        double step=(b-a)/1000000;

        for(int i=0;i<1000000;i++){

            res=res+f.applyAsDouble(a+step*(i+0.5));

        }
        return res*step;
    }

}
