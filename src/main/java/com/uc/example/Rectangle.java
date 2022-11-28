package com.uc.example;

/**
 * This is a Rectangle
 */
public class Rectangle {

    private final Point origin;
    private final int w;
    private final int h;

    /**
     * Creates a rectangle with a given point of origin
     *
     * @param origin point of origin
     * @param w      rectangle width
     * @param h      rectangle height
     */
    public Rectangle(final Point origin, final int w, final int h) {
        this.origin = origin;
        this.w = w;
        this.h = h;
    }

    /**
     * Creates a rectangle at position 0,0
     *
     * @param w rectangle width
     * @param h rectangle height
     */
    public Rectangle(final int w, final int h) {
        this.origin = new Point(0, 0);
        this.w = w;
        this.h = h;
    }

    /**
     * get origin
     *
     * @return origin
     */
    public Point getOrigin() {
        return origin;
    }


    /**
     * get width
     *
     * @return width
     */
    public int getW() {
        return w;
    }

    /**
     * get height
     *
     * @return height
     */
    public int getH() {
        return h;
    }

}
