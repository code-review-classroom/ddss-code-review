package com.uc.example;

/**
 * This is a Rectangle
 */
public class Rectangle {
    private Point origin;
    private int w;
    private int h;

    /**
     * Creates a rectangle with a given point of origin
     *
     * @param origin point of origin
     * @param w      rectangle width
     * @param h      rectangle height
     */
    public Rectangle(Point origin, int w, int h) {
        if (origin == null) {
            this.origin = new Point(0, 0);
        } else {
            this.origin = origin;
        }
        this.w = w;
        this.h = h;
    }

    /**
     * Creates a rectangle at position 0,0
     *
     * @param w rectangle width
     * @param h rectangle height
     */
    public Rectangle(int w, int h) {
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
     * set origin
     *
     * @param origin origin
     */
    public void setOrigin(Point origin) {
        this.origin = origin;
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
     * set width
     *
     * @param w width
     */
    public void setW(int w) {
        this.w = w;
    }

    /**
     * get height
     *
     * @return height
     */
    public int getH() {
        return h;
    }

    /**
     * set height
     *
     * @param h height
     */
    public void setH(int h) {
        this.h = h;
    }
}
