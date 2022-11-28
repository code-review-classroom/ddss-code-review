package com.uc.example;

/**
 * Point class.
 * Contains x and y integer variables.
 */
public class Point {
    private final int x;

    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
