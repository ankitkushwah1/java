package com.monocept.model;

public class Players {
	private String playerName;
	private String symbol;
	public Players(String playerName,String symbol) {
		this.playerName = playerName;
		this.symbol = symbol;
	}
	public String getName() {
		return playerName;
	}
	
	public String getSymbol() {
		return symbol;
	}
}
