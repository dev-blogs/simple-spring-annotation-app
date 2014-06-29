package com.component.figure;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Rectangle extends Figure {
    private int length;
    private int width;
    
    @Autowired 
    public Rectangle(@Value("rectangle") String name, @Value("4") int length, @Value("8") int width) {
	super(name);
        this.length = length;
        this.width = width;
    }

    public double square() {
        return this.length*this.width;
    }
}
