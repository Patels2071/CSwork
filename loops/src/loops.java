public class loops {
    public static void main(String[] args) {
        writeSquares();
        writeSquares2();
        writeSquares3();
        writeSquares4(1000);
        writeSquares5();
        writeSquares6();
        writeSquares7();
        helloThere();
        nestedLoop();

    }


    public static void writeSquares() {
        System.out.println("writeSquares...");
        //We want to create a program to print the
        //Squares of the first five integers.
        //One way to do it is like this
        System.out.println(1 + " squared = " + (1 * 1));
        System.out.println(2 + " squared = " + (2 * 2));
        System.out.println(3 + " squared = " + (3 * 3));
        System.out.println(4 + " squared = " + (4 * 4));
        System.out.println(5 + " squared = " + (5 * 5));

        writeSquares2();

    }

    public static void writeSquares2() {
        System.out.println("writeSquares2...");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " squared = " + (i * i));
        }
    }

    public static void writeSquares3() {
        System.out.println("writeSquares3...");
        for (int i = 1; i <= 1; i++) {
            System.out.println(i + " squared = " + (i * i));
        }
    }

    public static void writeSquares4(int stopVal) {
        System.out.println("writeSquares4");
        System.out.println("stop value is " + stopVal);
        for (int i = 1; i <= stopVal; i++) {
            System.out.println(i + " squared = " + (i * i));
        }
    }

    public static void writeSquares5() {
        System.out.println("writeSquares5");
        for (int c = (2 + 2); c <= (17 * 3); c++) {
            System.out.println(c + " sqaured = " + (c * c));

        }
    }

    public static void writeSquares6() {
        System.out.println("WriteSquares6...");
        for (int count = 0; count <= 100; count += 2) {
            System.out.println(count + " squared = " + (count * count));
        }
    }

    public static void writeSquares7() {
        System.out.println("WriteSquares7...");
        for (int n = 100; n >= 0; n--) {
            System.out.println(n + " squared = " + (n * n));
        }
    }

    public static void helloThere() {
        for (int i = 1; i < 10; i++) {
            for (int c = 1; c <= 4; c++) {
                System.out.println("Hello There");
            }
            System.out.println("General Kenobi");
        }
    }
    public static void nestedLoop(){
        for (int i = 1; i<= 6; i++){
            for (int j = 1; j <= 3; j++){
                System.out.println(j + " ");
            }
        }

    }
}