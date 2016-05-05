package com.github.monchenkoid.java_eight.function;

import java.util.function.Function;

/**
 * @author Iryna Monchenko
 * @version on 03.05.2016
 */
public class JavaFunction {

    static Function<String, String> function = x -> x.toUpperCase();
    static Function<String, String> function2 = x -> x.toLowerCase();

    public static void convertString(Function<String, String> function) {
        System.out.println(function.apply("StRaNgE"));
    }

    public static void run() {
        convertString(function);// prints STRANGE
        convertString(function2);// prints strange
    }
}