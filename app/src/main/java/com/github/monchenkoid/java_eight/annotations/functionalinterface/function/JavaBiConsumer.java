package com.github.monchenkoid.java_eight.annotations.functionalinterface.function;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author Iryna Monchenko
 * @version on 03.05.2016
 */

public class JavaBiConsumer {

    private static final String TAG = JavaBiConsumer.class.getSimpleName();

    public static void run() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        BiConsumer<Integer,String> biConsumer = (key, value) -> Log.i(TAG, "Key:"+ key+" Value:"+ value);
        map.forEach(biConsumer);
    }
}
