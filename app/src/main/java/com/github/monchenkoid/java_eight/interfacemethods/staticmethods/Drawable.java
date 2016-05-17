package com.github.monchenkoid.java_eight.interfacemethods.staticmethods;

/**
 * @author Iryna Monchanka
 * @version on 5/17/2016
 */

public interface Drawable {

    public void draw(int color);

    public static int rgb(int r, int g, int b) {
        return r << 16 | g << 8 | b;
    }
}
