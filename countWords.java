
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        List<String> items = Arrays.asList(reader.readLine().toLowerCase().split("[^\\p{L}\\p{Digit}]+"));
        Map<String,Long> stream=items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        stream.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).sorted(Comparator.comparing((Map.Entry<String, Long> entry) -> entry.getValue()).reversed()).limit(10).forEach(n-> System.out.println(n.getKey()));
    }

}
