package com.github.monchenkoid.java_eight.annotations.functionalinterface.function;

import android.util.Log;

import java.util.function.Supplier;

/**
 * @author Iryna Monchenko
 * @version on 03.05.2016
 */

public class JavaSupplier {

    private static final String TAG = JavaSupplier.class.getSimpleName();
    static Supplier<String> supplier1 = () -> "String1";
    static Supplier<String> supplier2 = () -> "String2";

    public static void printSuppliedString(Supplier<String> supplier) {
        Log.i(TAG, supplier.get());
    }

    public static void run() {
        printSuppliedString(supplier1);
        printSuppliedString(supplier2);
    }
}
