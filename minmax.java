import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

/**
 * Created by Valentin on 01.07.2017.
 */
public class minmax {
    public static void main(String[] args) {

    }



    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

            T[] array=(T[]) stream.sorted(order).toArray();
            if(array.length==0)   minMaxConsumer.accept(null,null);
            else minMaxConsumer.accept(array[0],array[array.length-1]);
    }
}
