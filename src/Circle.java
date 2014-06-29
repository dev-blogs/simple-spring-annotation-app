package com.component.figure;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Circle extends Figure {
    private int radius;
    public static double PI = 3.1415;

    @Autowired
    public Circle(@Value("circle") String name, @Value("5") int radius) {
        super(name);
        this.radius = radius;
    }
 
    public double square() {
        return PI*this.radius*this.radius;
    }
}
