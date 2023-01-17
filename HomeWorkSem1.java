package JavaLess1;

import java.util.Arrays;

import java.util.Random;

public class HomeWorkSem1 {
    public static void main(String[] args) {
        int i = getRand();
        int n = getIndexHighBit(i);

        System.out.println("i = " + i);
        System.out.println("n = " + n);

        int count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) count++;

        }
        int [] m1 = new int[count];
        count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) m1[count++] = j;
        }

        count = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) count++;

        }
        int [] m2 = new int[count];
        count = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) m2[count++] = j;

        }



        System.out.println("m1 = " + Arrays.toString(m1));
        System.out.println("m2 = " + Arrays.toString(m2));
    }


    private static int getRand(){

        return new Random().nextInt(-1, 2001);
    }
    private static int getIndexHighBit(int i){

        return Integer.toBinaryString(i).length();
    }

}
