public class Excercises {
    public static void main(String[] args) {
        physicsEquation();
        firstNumberLoop();
        fibonacciLoop();
        starLoop();
        staggeredStarLoop();
        staggeredNumberLoop();
        inverseStaggeredNumberLoop();
        inverseStaggeredStackedNumberLoop();
        weirdNumberLoop();
    }
    public static void physicsEquation(){
        double s = 2.5;
        double v = 25.0;
        double a = 1.8;
        double t  10.0;
        double x = 0.0;
        System.out.println(s+v*t+.5*a*(t*t));
    }
    public static void firstNumberLoop(){
        for (int a = 1;a<=10;a++)
        {
            System.out.println(a*a)
        }
    }
    public static void fibonacciLoop(){
        int c = 0
        int b = 1
        int a = 1
        for(int d = 0; d<12; d++){
            System.out.println(a)
            a=b+c;
            c=b;
            b=a;
        }
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
    public static void inverseStaggeredNumberLoop()
    {
       for (int column = 1; column <= 1; column++) {
            System.out.print("      1");
        }
        System.out.println();
        for (int column = 1; column <= 2; column++) {
            System.out.print("    2");
        }
        System.out.println();
        for (int column = 1; column <= 3; column++) {
            System.out.print("  3");
        }
        System.out.println();
        for (int column = 1; column <= 4; column++) {
            System.out.print(" 4");
        }
        System.out.println();
        for (int column = 1; column <= 5; column++) {
            System.out.print("5"); }    
    }
    public static void inverseStaggeredStackedNumberLoop()
    {
        for (int column = 1; column <= 1; column++) {
            System.out.print("    1");
        }
        System.out.println();
        for (int column = 1; column <= 2; column++) {
            System.out.print("   22");
        }
        System.out.println();
        for (int column = 1; column <= 3; column++) {
            System.out.print("  333");
        }
        System.out.println();
        for (int column = 1; column <= 4; column++) {
            System.out.print(" 4444");
        }
        System.out.println();
        for (int column = 1; column <= 5; column++) {
            System.out.print("55555"); } 
    }
    public static void weirdNumberLoop(){
        for (int column = 1; column <= 1; column++){
            System.out.print("--------------------------------------")
        }
        for (int column = 1; column <= 2; column++){
            System.out.print(" -^- -^- -^- -^- -^- -^- -^- -^- -^- ")
        
        }
        for (int column = 1; column <= 3; column++){
            System.out.print("_   _   _   _   _   _   _   _   _   _ ")
        }
        for (int column = 1; column <= 4; column++){
            System.out.print("11223344556677889900112233445566778899")
        }
        for (int column = 1; column <= 4; column++){
            System.out.print("______________________________________")
        }
        
    }
    }    