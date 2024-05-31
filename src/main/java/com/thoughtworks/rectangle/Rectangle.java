package com.thoughtworks.rectangle;

public class Rectangle {
    private int length;
    private int breadth;
    private int area;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int area(){
        this.area= this.length * this.breadth;
        return this.area;
    }
    public int getArea(){
       return area;
    }

}
