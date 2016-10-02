package chapter6.basic;

/**
 * Created by force_to on 2016/9/12.
 */
public class RedApple extends Apple{
    public int weight = 10;

    public RedApple() {
        System.out.println("RedApple constructor");
        System.out.print("super.grow()  ");
        super.grow();
        grow();
        System.out.println("super.color: " + super.color);
        super.weight = 1;
        System.out.println("weight: " + super.weight);
    }

    public RedApple(String color, int weight) {
        super(color, weight);
        System.out.println("super(color, weight)...\t" + color +"    " + weight);
    }

    public RedApple(String color) {
        super(color);
        System.out.println("super(color)...\t" + color +"    " + super.weight);

    }

    public void grow() {
        System.out.println("RedApple grow...");
    }
}
