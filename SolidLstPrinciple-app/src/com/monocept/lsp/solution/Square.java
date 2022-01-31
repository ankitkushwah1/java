package com.monocept.lsp.solution;

public class Square implements IPolygon {
	
	private int side;
	
	public Square(int side) {
		this.side = side;
	}
	
	@Override
	public double calculateArea() {
		return this.side*this.side;
	}
}
