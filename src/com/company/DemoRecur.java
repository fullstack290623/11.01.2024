package com.company;

public class DemoRecur {

    public static void main(String[] args) {

        // a b
        // c = a + b
        // a = b
        // b = c
        // 1 1 2 3 5 8 13 21 34 ..
        // 1 2 3 4 5 6 7 8 9 10

        int result = mul(1, 5);
        System.out.println(result);
        System.out.println(f1());
    }

    private static int f1() {
        return 1 * f2();
    }
    private static int f2() {
        return 2 * f3();
    }
    private static int f3() {
        return 3 * f4();
    }

    private static int f4() {
        return 4 * f5();
    }

    private static int f5() {
        return 5;
    }

    private static int mul(int min, int max) {
        if (min > max)
            return 1;
        int next = mul(min + 1, max);
        return min * next;
    }

//        private static int mul(1, 5) {
//            if (1 > 5)
//                return 1;
//            int next = mul(2, 5);
//            return min * next; // 120
//        }

//        private static int mul(2, 5) {
//            if (2 > 5)
//                return 1;
//            int next = mul(3, 5);
//            return min * next; // 120
//        }

//        private static int mul(3, 5) {
//            if (3 > 5)
//                return 1;
//            int next = mul(4, 5);
//            return min * next; // 60
//        }

//        private static int mul(4, 5) {
//            if (4 > 5)
//                return 1;
//            int next = mul(5, 5);
//            int next = 5;
//            return 4 * next; // 20
//        }

//        private static int mul(5, 5) {
//            if (5 > 5)
//                return 1;
//            int next = mul(6, 5);
//            int next = 1;
//            return 5 * 1; // 5
//        }

//        private static int mul(6, 5) {
//            if (6 > 5)
//                return 1;
//        }

}
