package com.ahsieh02.lambda.functionalInterface;

import com.ahsieh02.lambda.object.Square;
import java.lang.FunctionalInterface;

@FunctionalInterface
public interface Shapes {

    public abstract int getArea(Square square);
}
