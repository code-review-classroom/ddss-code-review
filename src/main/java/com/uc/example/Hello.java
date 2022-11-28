package com.uc.example;

public class Hello {
    public static void main(String[] args) {
        point originOne = new point(23, 94);
        rEctangle rectOne = new rEctangle(originOne, 100, 200);
        rEctangle rectTwo = new rEctangle(50, 100);

        System.out.println("RectOne w:" + rectOne.w);
        System.out.println("RectOne h:" + rectOne.h);


        rectTwo.origin = originOne;

        System.out.println(originOne);
        System.out.println(rectOne.origin);
        System.out.println(rectTwo.origin);

        originOne = null;

        System.out.println(originOne);
        System.out.println(rectOne.origin);
        System.out.println(rectTwo.origin);

        System.out.println("rectTwo.origin.x: " + rectTwo.origin.x);

        point pt1, pt2;
        pt1 = new point(100, 100);
        pt2 = pt1;

        pt1.x = 200;
        pt1.y = 200;

        System.out.println("Point1: " + pt1 + " ::" + pt1.x + ", " + pt1.y);
        System.out.println("Point2: " + pt2 + " ::" + pt2.x + ", " + pt2.y);

        rectOne.origin = pt1;

        pt2 = null;
        System.out.println("RectOne " + rectOne.origin);
        System.out.println("pt1: " + pt1);
        System.out.println("pt2: " + pt2);
        System.out.println("pt2.x: " + pt2.x);
    }
}
