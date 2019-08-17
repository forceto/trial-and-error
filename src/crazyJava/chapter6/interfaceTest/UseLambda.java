package crazyJava.chapter6.interfaceTest;

/**
 * Created by force_to on 2016/10/4.
 */
public class UseLambda {
    public UseLambda() {
        Lambda l = new Lambda();
        l.eat(() -> {
            System.out.println("delicious");
        });

        l.drive((weather) -> {
            System.out.println(weather);
        });

        l.add((int a, int b) -> {
            return a + b;
        });
    }
}
