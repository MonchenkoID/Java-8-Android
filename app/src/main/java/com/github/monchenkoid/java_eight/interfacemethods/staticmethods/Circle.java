package com.github.monchenkoid.java_eight.interfacemethods.staticmethods;

import android.util.Log;

/**
 * @author Iryna Monchanka
 * @version on 5/17/2016
 */

public class Circle implements Drawable {
    
    private static final String TAG = Circle.class.getSimpleName();
    private int x, y, r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw(int color) {
        Log.i(TAG, String.format("Drawing circle(%d, %d, %d) in color %x%n", x, y, r, color));
    }
}

