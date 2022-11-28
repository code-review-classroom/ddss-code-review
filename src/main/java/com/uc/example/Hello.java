package com.uc.example;

public class Hello {
    public static void main(String[] args) {
        Point originOne = new Point(23, 94);
        Point originTwo = null;
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(originTwo, 50, 100);

        System.out.println("RectOne origin w:" + rectOne.getOrigin().getX());
        System.out.println("RectTwo origin X:" + rectTwo.getOrigin().getX());
    }
}
