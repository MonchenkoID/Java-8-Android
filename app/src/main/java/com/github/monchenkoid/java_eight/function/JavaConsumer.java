package com.github.monchenkoid.java_eight.function;

import android.util.Log;

import java.util.function.Consumer;

/**
 * @author Iryna Monchenko
 * @version on 03.05.2016
 */

public class JavaConsumer {

    private static final String TAG = JavaConsumer.class.getSimpleName();
    static Consumer<String> function = x -> Log.i(TAG, x);
    static Consumer<String> function2 = x -> Log.i(TAG, x.toLowerCase());

    public static void consumeString(Consumer<String> consumer, String x) {
        consumer.accept(x);
    }

    public static void run() {
        consumeString(function, "StringA");// prints StringA
        consumeString(function2, "StringA");// prints stringa
    }
}
