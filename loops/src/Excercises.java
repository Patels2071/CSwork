public class Excercises {
    public static void main(String[] args) {
        //physicsEquation();
        //firstNumberLoop();
        //fibonacciLoop();
        starLoop();
        staggeredStarLoop();
        staggeredNumberLoop();
        //inverseStaggeredNumberLoop();
        //inverseStaggeredStackedNumberLoop();
        //weirdNumberLoop();
    }
    public static void starLoop(){
        for (int column = 1; column <= 5; column++) {
            System.out.print("*");
        }
        System.out.println();
        for (int column = 1; column <= 5; column++) {
            System.out.print("*");
        }
        System.out.println();
        for (int column = 1; column <= 5; column++) {
            System.out.print("*");
        }
        System.out.println();
        for (int column = 1; column <= 5; column++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void staggeredStarLoop() {
        for (int column = 1; column <= 1; column++) {
            System.out.print("*");
        }
        System.out.println();
        for (int column = 1; column <= 2; column++) {
            System.out.print("*");
        }
        System.out.println();
        for (int column = 1; column <= 3; column++) {
            System.out.print("*");
        }
        System.out.println();
        for (int column = 1; column <= 4; column++) {
            System.out.print("*");
        }
        System.out.println();
        for (int column = 1; column <= 5; column++) {
            System.out.print("*");
        }
        System.out.println();
        for (int column = 1; column <= 6; column++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void staggeredNumberLoop() {
        for (int column = 1; column <= 1; column++) {
            System.out.print("1");
        }
        System.out.println();
        for (int column = 1; column <= 2; column++) {
            System.out.print("2");
        }
        System.out.println();
        for (int column = 1; column <= 3; column++) {
            System.out.print("3");
        }
        System.out.println();
        for (int column = 1; column <= 4; column++) {
            System.out.print("4");
        }
        System.out.println();
        for (int column = 1; column <= 5; column++) {
            System.out.print("5");
        }
        System.out.println();
        for (int column = 1; column <= 6; column++) {
            System.out.print("6");
        }
        System.out.println();
        for (int column = 1; column <= 7; column++) {
            System.out.print("7");
        }
        System.out.println();
    }

}