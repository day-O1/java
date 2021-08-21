package net.itimeline.java.foudation.array;

import java.util.Arrays;

/**
 * @author mfg
 * @version 1.0
 */
public class ArrayStaticInt {
    public static void main(String[] args) {
        int[] source =new int[]{10,20,30};
        System.out.println(source);
        int [] target =source;
        target[0]=111;
        System.out.println(target);
        for (int i = 0; i <source.length ; i++) {
            System.out.println(target[i]);
        }
        System.out.println(Arrays.toString(source));
    }

}
