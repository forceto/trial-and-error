package chapter6.basic;

/**
 * Created by force_to on 2016/9/12.
 */
public class Apple {
    public String color;
    public int weight;

    public Apple() {
        color = "blue";
        weight = 100;
    }

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Apple(String color) {
        this.color = color;
        weight = 1000;
    }

    public void grow() {
        System.out.println("Apple is growing...");
    }
}
