package com.uc.example;

/**
 * This is a Point
 */
public class Point {

    private final int x;
    private final int y;

    /**
     * Creates a new Point with x and y
     *
     * @param x position
     * @param y position
     */
    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Get X
     *
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * Get Y
     *
     * @return y
     */
    public int getY() {
        return y;
    }
}
