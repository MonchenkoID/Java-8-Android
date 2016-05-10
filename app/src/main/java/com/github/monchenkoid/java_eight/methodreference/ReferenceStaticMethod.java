package com.github.monchenkoid.java_eight.methodreference;

/**
 * @author Iryna Monchenko
 * @version on 05.05.2016
 */
public class ReferenceStaticMethod {

    public static void run() {
        methodReference();
        lambda();
        anonymousClass();
    }

    private static void methodReference() {
        new Thread(ReferenceStaticMethod::doWork).start();
    }

    private static void lambda() {
        new Thread(() -> doWork()).start();
    }

    private static void anonymousClass() {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                doWork();
            }
        }).start();
    }

    static void doWork()
    {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 50; i++)
        {
            System.out.printf("%s: %d%n", name, i);
            try
            {
                Thread.sleep((int) (Math.random()*50));
            }
            catch (InterruptedException ie)
            {
            }
        }
    }
}