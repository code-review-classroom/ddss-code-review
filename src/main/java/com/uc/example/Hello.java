package com.uc.example;

public class Hello {
    private static int xOriginOne = 23;
    private static int yOriginOne = 94;
    public static void main(String[] args) {
        final Point originOne = new Point(xOriginOne, yOriginOne);
        Point originTwo = null;
        final Rectangle rectOne = new Rectangle(originOne, 100, 200);
        final Rectangle rectTwo = new Rectangle(originTwo, 50, 100);

        System.out.println("RectOne origin w:" + rectOne.origin.x);
        System.out.println("RectTwo origin X:" + rectTwo.origin.x);
    }
}
