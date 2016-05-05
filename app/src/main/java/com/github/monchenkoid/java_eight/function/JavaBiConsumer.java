package com.github.monchenkoid.java_eight.function;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author Iryna Monchenko
 * @version on 03.05.2016
 */

public class JavaBiConsumer {

    public static void run() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        BiConsumer<Integer,String> biConsumer = (key, value) ->
                System.out.println("Key:"+ key+" Value:"+ value);
        map.forEach(biConsumer);
    }
}
