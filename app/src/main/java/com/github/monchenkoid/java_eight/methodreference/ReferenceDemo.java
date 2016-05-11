package com.github.monchenkoid.java_eight.methodreference;

import android.util.Log;

/**
 * @author Iryna Monchenko
 * @version on 05.05.2016
 */
public class ReferenceDemo {

    private static final String TAG = ReferenceDemo.class.getSimpleName();

    public static void commonMethod() {
        Log.i(TAG, "This method is already defined.");
    }

    public void implement() {
        // Anonymous class.
        IsReferable demoOne = new IsReferable() {
            @Override
            public void referenceDemo() {
                ReferenceDemo.commonMethod();
            }
        };
        demoOne.referenceDemo();
        // Lambda implementaion.
        IsReferable demo = () -> ReferenceDemo.commonMethod();
        demo.referenceDemo();
        // Method reference.
        IsReferable demoTwo = ReferenceDemo::commonMethod;
        demoTwo.referenceDemo();
    }

    // Don't forget Functional interfaces are heart of labmda expression.
    interface IsReferable {
        public void referenceDemo();
    }
}
