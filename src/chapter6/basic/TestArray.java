package chapter6.basic;


/**
 * Created by force_to on 2016/9/6.
 */
public class TestArray {
    public TestArray() {

        multidimensionalArray();
    }

    private void multidimensionalArray() {
        /*int[][] arr = new int[3][];
        System.out.println(arr.length);
        arr[0] = new int[5];
        System.out.println(arr[0].length);
        arr[1] = new int[6];
        System.out.println(arr[1].length);
        for (int i : arr[1]) {
            System.out.print(i + "\t");
        }*/
        int[][] arr1 = new int[5][];
        arr1[0] = new int[8];

    }

    private void initiateZero() {
        int[] arr = new int[8];
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

    private void exchangeQuote() {
        String[] s1 = new String[5];
        String[] s2 = {"hi", "boundary"};
        System.out.println("s1.length:\t" + s1.length);
        System.out.println("s2.length:\t" +s2.length);
        s2 = s1;
        System.out.println("改变索引");
        System.out.println("s1.length:\t" + s1.length);
        System.out.println("s2.length:\t" +s2.length);

    }

    private void initiate(){
        //静态初始化
        int[] arr1 = {3,4,5,6,7};
        // 动态初始化
        int[] num = new int[10];
        int[] arr2 = new int[4];
        System.out.println("arr1:\t" + arr1);
    }
    private void showArray(){
        String[] name = new String[5];
        name[0] = "Tony";
        name[1] = "Stack";
        name[2] = "Miao";
        name[3] = "Obama";
        name[4] = "Liao";
        System.out.println("Array name : \tname");
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + "\t");
        }
        System.out.println();
    }

    private void printArray(){
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random()*10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    private void forEachTravel(){
        String[] arr = {"boundary","hi"};
        for(String str : arr) {
            System.out.println(str);
        }
    }

    private void erweishuzu(){
        int[][] arr = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        double[][] arr1 = new double[2][4];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private void zero() {
        double[] arr = {};
        System.out.println(arr.length);
    }

    private void foreach() {
        int[] arr1 = new int[9];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }
        for (int i : arr1) {
            System.out.println(i);
        }
    }

    private void objectArray(){
        Person Hang = new Person("Hang");
        Hang.age = 20;
        Hang.height = 200;

        Person Lee = new Person("Lee");
        Lee.age = 10;
        Lee.height = 100;

        Person[] arr = new Person[2];

        arr[0] = Hang;

        arr[1] = Lee;

        System.out.println(Hang);
        System.out.println(arr[0]);
        System.out.println();
        System.out.println(arr[1]);
        System.out.println(Lee);
        System.out.println();
        System.out.println("转移指针");
        Hang = Lee;
        System.out.println("Hang:\t" + Hang);
        System.out.println(arr[0]);
    }


}














