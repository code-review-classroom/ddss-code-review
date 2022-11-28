package com.uc.example;

/**
 * This is a Rectangle
 */
public class Rectangle {
    Point origin;
    int w;
    int h;

    /**
     * Creates a rectangle with a given point of origin
     * @param origin point of origin
     * @param w rectangle width
     * @param h rectangle height
     */
    public Rectangle(Point origin, int w, int h) {
        this.origin = origin;
        this.w = w;
        this.h = h;
    }

    /**
     * Creates a rectangle at position 0,0
     * @param w rectangle width
     * @param h rectangle height
     */
    public Rectangle(int w, int h) {
        this.origin = new Point(0, 0);
        this.w = w;
        this.h = h;
    }
}
