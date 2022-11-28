package com.uc.example;

public class Hello {

    public static void main(String[] args) {
        final Point originOne = new Point(23, 94);
        final Rectangle rectOne = new Rectangle(originOne, 100, 200);
        final Rectangle rectTwo = new Rectangle(50, 100);

        System.out.println("RectOne origin (X,Y): " + String.format("(%d,%d).", rectOne.getOrigin().getX(),
                rectOne.getOrigin().getY()));
        System.out.println("RectTwo origin (X,Y): " + String.format("(%d,%d).", rectTwo.getOrigin().getX(),
                rectTwo.getOrigin().getY()));

        System.out.println("RectOne area: " + rectOne.getArea());
        System.out.println("RectTwi area: " + rectTwo.getArea());
    }
}
