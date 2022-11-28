package com.uc.example;

/**
 * Rectangle Class.
 * Contains a class {@link Point} as origin point and,
 * height and width variables.
 */
public class Rectangle {
    private final Point origin;

    private final int w, h;

    public Rectangle(Point origin, int w, int h) {
        this.origin = origin;
        this.w = w;
        this.h = h;
    }

    public Rectangle(int w, int h) {
        this.origin = new Point(0, 0);
        this.w = w;
        this.h = h;
    }

    public Point getOrigin() {
        return origin;
    }

    public int getArea() {
        return this.w * this.h;
    }
}
