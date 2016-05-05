package com.github.monchenkoid.java_eight.function;

import java.util.function.Predicate;

/**
 * @author Iryna Monchenko
 * @version on 04.05.2016
 */
public class JavaPredicate {

    static Predicate<Double> function = x -> x > 10;
    static Predicate<Double> function2 = x -> x < -10;

    public static void testValue(Predicate<Double> predicate, Double d){
        predicate.test(d);
    }

    public static void run() {
        System.out.println(function.test(new Double(9)));// prints false
        System.out.println(function2.test(new Double(-20)));// prints true
    }

}
