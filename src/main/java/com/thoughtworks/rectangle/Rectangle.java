package com.thoughtworks.rectangle;

public class Rectangle {
    private int length;
    private int breadth;
    private int area;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void area(){
        this.area= this.length * this.breadth;
          
    }
    public int getArea(){
       return area;
    }

}
