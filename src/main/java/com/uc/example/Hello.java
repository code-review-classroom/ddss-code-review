package com.uc.example;

public class Hello {
    public static void main(String[] args) {
        point originOne = new point(23, 94);
        point OriginTWO = null;
        rEctangle rectOne = new rEctangle(originOne, 100, 200);
        rEctangle rectTwo = new rEctangle(OriginTWO, 50, 100);

        System.out.println("RectOne origin w:" + rectOne.origin.x);
        System.out.println("RectTwo origin X:" + rectTwo.origin.x);
    }
}
