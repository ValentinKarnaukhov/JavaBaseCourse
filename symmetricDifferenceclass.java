import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Valentin on 30.06.2017.
 */
class symmetricDifferenceclass{
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2=new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);
        System.out.println(symmetricDifference(set1,set2));
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> sets=new HashSet<>();
        Set<T> set1t= new HashSet<>(set1);
        Set<T> set2t= new HashSet<>(set2);
        sets.addAll(set1t);
        sets.addAll(set2t);
        set1t.retainAll(set2t);
        sets.removeAll(set1t);
        return sets;
    }

}



