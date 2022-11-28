package com.uc.example;

public class rEctangle {
    point origin;
    int w;
    int h;

    public rEctangle(point origin, int w, int h) {
        this.origin = origin;
        this.w = w;
        this.h = h;
    }

    public rEctangle(int w, int h) {
        this.origin = new point(0, 0);
        this.w = w;
        this.h = h;
    }
}
