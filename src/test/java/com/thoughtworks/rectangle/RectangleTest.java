package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RectangleTest{
    @Test
    public void shouldCalculateAreaOfRectangleWhenLengthAndBreadthAre4and5 () {
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.area();
        assertEquals(20, rectangle.getArea());
    }
}