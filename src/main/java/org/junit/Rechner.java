package org.junit;

import java.util.stream.DoubleStream;

public class Rechner {
    static double addition(double... num) {

        return DoubleStream.of(num).sum();
    }
    static double multiplikation(double... num) {

        return DoubleStream.of(num).reduce(1,(a,b) -> a * b);
    }

}
