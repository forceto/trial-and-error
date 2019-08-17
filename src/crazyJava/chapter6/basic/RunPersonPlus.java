package crazyJava.chapter6.basic;

/**
 * Created by force_to on 2016/9/17.
 */
public class RunPersonPlus {
    public RunPersonPlus() {
        Name name = new Name("wang", "tong");
        PersonPlus p = new PersonPlus(name);
        System.out.println(p.getName().getFirstName() + "   " + p.getName().getLastName());
        p.getName().setFirstName("Li");
        System.out.println(p.getName().getFirstName() + "   " + p.getName().getLastName());
    }
}
