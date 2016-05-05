package com.github.monchenkoid.java_eight.function;

import java.util.function.BiPredicate;

/**
 * @author Iryna Monchenko
 * @version on 04.05.2016
 */
public class JavaBiPredicate {

    public static void run() {
        BiPredicate<Integer, String> condition = (i, s)-> i>20 && s.startsWith("R");
        System.out.println(condition.test(10,"Ram"));
        System.out.println(condition.test(30,"Shyam"));
        System.out.println(condition.test(30,"Ram"));
    }

}
