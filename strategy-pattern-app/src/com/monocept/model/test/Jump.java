package com.monocept.model.test;

public class Jump implements Strategy {
	
	@Override
	public void doMoves() {
		System.out.println("JUMP");
	}
}
