package edu.global.ex.vo;

import lombok.Data;


@Data
public class CircleVO {

	private double radius;
	
	public double getArea() {
		
		return radius*radius*Math.PI;
	}
	
}
