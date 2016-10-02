package chapter6.basic;

/**
 * Created by force_to on 2016/9/8.
 */
public class Person {
    public Person(String name){
        this.name = name;
    }

    public String name;
    public int age;
    public double height;

    public void info() {
        System.out.println(name + "\t" + age + " \t" +height);
    }

    @Override
    public String toString() {
        return "Person\t" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height ;
    }
}
