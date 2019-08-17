package crazyJava.chapter6.basic;

import crazyJava.chapter6.basic.Name;
import crazyJava.chapter6.basic.Person;

/**
 * Created by force_to on 2016/9/17.
 */
public class PersonPlus {
    private final Name name;
    public PersonPlus(Name name) {
        // 通过创建的匿名类来实现封装，避免被该值
        this.name = new Name(name.getFirstName(), name.getLastName());
    }

    public Name getName() {
        return new Name(name.getFirstName(), name.getLastName());
    }
}
