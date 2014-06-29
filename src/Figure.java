package com.component.figure;

public abstract class Figure {
	private String name;

	public Figure(String name) {
		System.out.println("Bean " + name + " is being created");
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public abstract double square();
}
