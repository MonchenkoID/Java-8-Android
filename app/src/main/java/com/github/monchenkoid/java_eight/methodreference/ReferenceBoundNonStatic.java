package com.github.monchenkoid.java_eight.methodreference;

import java.util.function.Supplier;

/**
 * @author Iryna Monchenko
 * @version on 05.05.2016
 */
public class ReferenceBoundNonStatic {

    public static void run(){
        String s = "method references are cool";
        print(s::toString);
    }

    public static void print(Supplier<String> supplier)
    {
        System.out.println(supplier.get());
    }
}