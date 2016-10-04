package chapter6.interfaceTest;

/**
 * Created by force_to on 2016/10/4.
 */
public class Lambda {
    public void eat(Eatable e) {
        System.out.println(e);
        e.taste();
    }

    public void drive(Flyable f) {
        System.out.println(f);
        f.fly("Çç¿ÕÍòÀï");
    }

    public void add(Addable a) {

    }
}
