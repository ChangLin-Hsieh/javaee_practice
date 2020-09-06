package com.ahsieh02.lambda.Implement;

import com.ahsieh02.lambda.functionalInterface.Shapes;
import com.ahsieh02.lambda.object.Square;

public class ShapesImplement {

    public static void main(String[] args) {
        Square square = new Square(4);
        Shapes shapes = (input) -> {
            return input.calculateArea();
        };

        Shapes shapes1 = Square::calculateArea;

        System.out.println("area " + shapes.getArea(square));
        System.out.println("area " + shapes1.getArea(square));
    }
}
