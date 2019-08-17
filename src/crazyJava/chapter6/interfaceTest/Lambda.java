package crazyJava.chapter6.interfaceTest;

/**
 * Created by force_to on 2016/10/4.
 */
public class Lambda {
    public void eat(Eatable e) {
        e.taste();
    }

    public void drive(Flyable f) {
        f.fly("晴空万里");
    }

    public void add(Addable a) {
        System.out.println("5 + 3 = " + a.add(5,3));
    }
}
