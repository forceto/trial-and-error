package crazyJava.chapter6.basic;

/**
 * Created by force_to on 2016/9/12.
 */
public class RealPerson {
    private final int arm = 2;
    private final int eye = 2;
    private final int foot = 2;

    public int age;
    public String name;

    public RealPerson(String name, int age) {
        System.out.println("执行有 name 和 age的构造函数");
        setAge(age);
        setName(name);
        showInfo();
        System.out.println("有 name 和 age的构造函数结束");
        System.out.println();
    }

    public RealPerson (String name) {
        System.out.println("执行只有 name 的构造函数");
        setName(name);
        age = 20;
        showInfo();
        System.out.println("只有 name 的构造函数结束");
        System.out.println();
    }

    public RealPerson (int age) {
        System.out.println("执行只有 age 的构造函数");
        name = "default";
        setAge(age);
        showInfo();
        System.out.println("只有 name 的构造函数结束");
        System.out.println();
    }

    public RealPerson() {
        System.out.println("执行无参构造函数");
        name = "default";
        age = 20;
        showInfo();
        System.out.println("无参构造函数结束");
        System.out.println();
    }

    public int getArm() {
        return arm;
    }

    public int getEye() {
        return eye;
    }

    public int getFoot() {
        return foot;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 130) {
            this.age = age;
        } else {
            System.out.println("age out of boundary");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 30) {
            this.name = name;
        } else {
            System.out.println("name is out of boundary");
        }
    }

    private void showInfo() {
        System.out.println("personal info:");
        System.out.println(name + " : " + age + "  " + arm + "  " + eye + "   " + foot);
    }
}













