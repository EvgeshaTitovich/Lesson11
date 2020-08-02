package com.lessons.lesson11;

public class Rectangle {

    private Point topLeftCorner;
    private Point lowerRightCorner;

    public Rectangle(Point topLeftCorner, Point lowerRightCorner) {
        this.topLeftCorner = topLeftCorner;
        this.lowerRightCorner = lowerRightCorner;
    }

    public int getArea (){
        return (lowerRightCorner.getX() - topLeftCorner.getX())*(topLeftCorner.getY() - lowerRightCorner.getY());
    }

    public double getDiagonal(){
        return topLeftCorner.distance(lowerRightCorner);
    }
}
