package com.uc.example;

public class Rectangle {
    private final Point _origin;
    private int _w;
    private int _h;

    public Rectangle(Point origin, int width, int height) {
        this._origin = origin;
        this._w = width;
        this._h = height;
    }

    public Rectangle(int w, int h) {
        this._origin = new Point(0, 0);
        this._w = w;
        this._h = h;
    }

    public int getW() {
        return _w;
    }

    public void setW(int w) {
        this._w = w;
    }

    public int getH() {
        return _h;
    }

    public void setH(int h) {
        this._h = h;
    }

    public Point getOrigin() {
        return _origin;
    }
}
