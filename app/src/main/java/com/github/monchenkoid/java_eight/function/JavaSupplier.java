package com.github.monchenkoid.java_eight.function;

import java.util.function.Supplier;

/**
 * @author Iryna Monchenko
 * @version on 03.05.2016
 */

public class JavaSupplier {

    static Supplier<String> supplier1 = () -> "String1";
    static Supplier<String> supplier2 = () -> "String2";

    public static void printSuppliedString(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

    public static void run() {
        printSuppliedString(supplier1);
        printSuppliedString(supplier2);
    }
}
