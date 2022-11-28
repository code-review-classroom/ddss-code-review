package com.uc.example;

public class Rectangle {
    private final Point origin;
    private int w;
    private int h;

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

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public Point getOrigin() {
        return origin;
    }
}
