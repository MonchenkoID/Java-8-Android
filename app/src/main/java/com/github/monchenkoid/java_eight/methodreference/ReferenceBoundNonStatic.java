package com.github.monchenkoid.java_eight.methodreference;

import android.util.Log;

import java.util.function.Supplier;

/**
 * @author Iryna Monchenko
 * @version on 05.05.2016
 */
public class ReferenceBoundNonStatic {

    private static final String TAG = ReferenceBoundNonStatic.class.getSimpleName();
    private static final String STRING = "method references are cool";

    public static void run(){
        methodReference();
        lambda();
        anonymousClass();
    }

    private static void anonymousClass() {
        print(new Supplier<String>()
        {
            @Override
            public String get()
            {
                return STRING.toString(); // closes over s
            }
        });
    }

    private static void lambda() {
        print(() -> STRING.toString());
    }

    private static void methodReference() {
        print(STRING::toString);
    }

    public static void print(Supplier<String> supplier)
    {
        Log.i(TAG, supplier.get());
    }
}