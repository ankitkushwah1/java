package com.monocept.model.test;

public class Punch implements Strategy {

	@Override
	public void doMoves() {
		System.out.println("PUNCH");
	}
}
