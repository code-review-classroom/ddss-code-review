package com.uc.example;

public class Hello {

    private static final int ORIGIN_ONE_X = 23;
    private static final int ORIGIN_ONE_Y = 94;
    private static final int RECT_ONE_W = 100;
    private static final int RECT_ONE_H = 200;
    private static final int RECT_TWO_W = 50;
    private static final int RECT_TWO_H = 100;

    public static void main(String[] args) {

        final Point originOne = new Point(ORIGIN_ONE_X, ORIGIN_ONE_Y);
        final Rectangle rectOne = new Rectangle(originOne, RECT_ONE_W, RECT_ONE_H);
        final Rectangle rectTwo = new Rectangle(RECT_TWO_W, RECT_TWO_H);

        System.out.println("RectOne origin w:" + rectOne.getOrigin().getX());
        System.out.println("RectTwo origin X:" + rectTwo.getOrigin().getX());
    }
}
