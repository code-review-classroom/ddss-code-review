package com.uc.example;

public class Hello {
    public static void main(String[] args) {
        Point originOne = new Point(23, 94);
        Point OriginTWO = null;
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(OriginTWO, 50, 100);

        System.out.println("RectOne origin w:" + rectOne.origin.x);
        System.out.println("RectTwo origin X:" + rectTwo.origin.x);
    }
}
