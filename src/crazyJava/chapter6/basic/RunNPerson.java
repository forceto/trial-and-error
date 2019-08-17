package crazyJava.chapter6.basic;

import crazyJava.chapter6.basic.NPerson;
import crazyJava.chapter6.basic.Name;
/**
 * Created by force_to on 2016/9/17.
 */
public class RunNPerson {
    public RunNPerson() {
        Name name = new Name("wang", "tong");
        NPerson p = new NPerson(name);
        System.out.println(p.getName().getFirstName() + "   " + p.getName().getLastName());
        p.getName().setFirstName("Li");
        System.out.println(p.getName().getFirstName() + "   " + p.getName().getLastName());

    }

}
