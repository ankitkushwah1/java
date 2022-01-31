package com.monocept.model.test;

public class Kick implements Strategy {

	@Override
	public void doMoves() {
		System.out.println("KICK");
	}
}
