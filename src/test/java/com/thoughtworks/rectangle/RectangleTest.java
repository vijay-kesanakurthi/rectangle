package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RectangleTest{
    @Test
    public void shouldCalculateAreaOfRectangleWhenLengthAndBreadthAre4and5 () {
        Rectangle rectangle = new Rectangle(4, 5);
        assertThat( 20,is( equalTo(rectangle.area())));

    }
}