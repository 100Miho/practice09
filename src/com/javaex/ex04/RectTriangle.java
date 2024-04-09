package com.javaex.ex04;

public class RectTriangle extends Shape {
	// 필드
    private double width;
    private double height;
    
    // 생성자
	public RectTriangle(double w, double h) {
//		super(3);
		this.width = w;
		this.height = h;
	}

	@Override
	public double getArea() {
		return width * height / 2;
	}

	@Override
	public double getPerimeter() {
		return height + width + (Math.sqrt(height * height + width * width));
	}
}