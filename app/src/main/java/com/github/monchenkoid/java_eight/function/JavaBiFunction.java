package com.github.monchenkoid.java_eight.function;

import java.util.function.BiFunction;

/**
 * @author Iryna Monchenko
 * @version on 03.05.2016
 */
public class JavaBiFunction {

    public static void run() {
        String result = calc((a, b) -> ": " + (a * b), 3, 5);
        System.out.println(result);
        concat();
    }

    public static String calc(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2) {
        return bi.apply(i1, i2);
    }

    public static void concat() {
        BiFunction<String, String, String> bi = (x, y) -> {
            return x + y;
        };

        System.out.println(bi.apply("java2s.com", " tutorial"));
    }
}