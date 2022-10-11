import java.util.ArrayList;
import java.util.List;

public class ForEachOrdered {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();

        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hockey");

        System.out.println("Iterating by passing Lambda Expression");

        gamesList.stream().forEachOrdered(games -> System.out.println(games));

        System.out.println();

        System.out.println("Iterting by passing Method referance");
        gamesList.stream().forEachOrdered(System.out::println);
    }
}
