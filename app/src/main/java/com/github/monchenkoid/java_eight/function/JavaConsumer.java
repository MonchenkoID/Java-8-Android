package com.github.monchenkoid.java_eight.function;

import java.util.function.Consumer;

/**
 * @author Iryna Monchenko
 * @version on 03.05.2016
 */

public class JavaConsumer {

    static Consumer<String> function = x -> System.out.println(x);
    static Consumer<String> function2 = x -> System.out.println(x.toLowerCase());

    public static void consumeString(Consumer<String> consumer, String x) {
        consumer.accept(x);
    }

    public static void run() {
        consumeString(function, "StringA");// prints StringA
        consumeString(function2, "StringA");// prints stringa
    }
}
