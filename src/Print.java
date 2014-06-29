package com.component;

import com.component.figure.Figure;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class Print {
    @Autowired
    @Qualifier("circle")
    private Figure figure;

    public Print() {
	System.out.println("Bean print is being created");
    }

    public void showSquare() {
        System.out.println("Square of " + this.figure.getName() + " is " + this.figure.square());
    }
}
