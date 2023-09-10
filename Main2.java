public class Main2 {
    // loops
    // conditional
    // repetitively
    // 1 to 1000000
    // for, while, do-while, foreach
    // print all the even numbers from 1 to 100
    // full divisible by 2
    // reminder 0
    // examples: 2,4,6,8,10...
    public static void main(String[] args) {
        // execution flow
        // init: 1
        // condition: n
        // increment: n

        // init
        // condition
        // body
        // increment

        // condition
        // body
        // increment
        // 10 to 1
        // multiplication table
        // 1 * 2 = 2
        // 1 * 3 = 3
        // ...
        // 10

        // 100 times
        // n * m
//        for (int i = 1; i <= 10; i++) { // 10 times
//            for (int j = 1; j <= 10; j++) { // 10 times
//                int val = i * j;
//                System.out.println(i + " * " + j + " = " + val);
//            }
//            System.out.println();
//        }

        // print 1 to 10
//        int i = 2;
//        while (true) {
//            System.out.println(i);
//            i++;
//        }

        // arithmatic operators: +,-,*,/,%, ++, --
        // unary: ++, --
        // do-while
        // at least  execute body once
//        int i = 11;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 10);

        int i = 10;
        int j = i++; // pre: increment, assign
        // post: assign, increment
        System.out.println("i:" + i + " j:" + j);

        // 1 to 10
        for (int k = 1; k <= 10; ++k) {
            System.out.println(k);
        }
    }
}
