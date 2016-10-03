package chapter14;

import java.util.Scanner;

/**
 * Created by force_to on 2016/10/3.
 */
public class Vehicle {
    public Vehicle() {
    }

    public void buyCar() {
        System.out.println("which Car do you want?");
        System.out.println("1.  Porshe");
        System.out.println("2.  Audi");
        System.out.println("3.  Farari");
        System.out.println("4.  Koenigsegg");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        try {
            System.out.println("wonderful! you get a " + carBound(type));
        } catch (Exception e) {
            System.out.println(e.getMessage() + ",再选一次");
            buyCar();
        }

    }

    public String carBound(int type) {
        String bound = "";
        switch (type) {
            case 1:
                bound = "Porshe";
                break;
            case 2:
                bound = "Audi";
                break;
            case 3:
                bound = "Farari";
                break;
            case 4:
                bound = "Koenigsegg";
                break;
            default :
                throw new CarBoundException("只能选 1 —— 4");
        }
        return bound;
    }
}









