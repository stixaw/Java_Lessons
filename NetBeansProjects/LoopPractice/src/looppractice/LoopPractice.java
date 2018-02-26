package looppractice;

public class LoopPractice {

    public static void practiceWhileLoop() {
        int x = 0;

        while (x < 5) {
            System.out.println("The value of x is " + x);
            x++;
        }
        System.out.println("--------------------");
    }

    public static void practiceDoWhileLoop() {
        int x = 0;
        do {
            System.out.println("the value of x is " + x);
            x++;
        } while (x < 10);
        System.out.println("--------------------");
    }

    public static void practiceForeLoop() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                System.out.println(String.format("{%d, %d}", x, y));
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //practiceWhileLoop();
        //practiceDoWhileLoop();
        practiceForeLoop();
    }

}
