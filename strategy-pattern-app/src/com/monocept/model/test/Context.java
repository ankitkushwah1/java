package com.monocept.model.test;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void executeStrategy() {
		this.strategy.doMoves();
	}
}
