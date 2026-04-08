import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    static void main(String[] args) {
        String[] fruits = new String[] { "apple", "berry", "citrus", "damasco", "grape", "orange", "strawberry" };
        Map<String, String> m = Stream
                .of(fruits)
                .collect(Collectors.toMap(
                        s -> s.toUpperCase().substring(0, s.length()),
                        Function.identity()));
        m.forEach((k, v) ->
                System.out.println(k + " " + v));
    }
}