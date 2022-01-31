package com.monocept.ocp.solution;

import com.monocept.ocp.solution.*;

public class DiwaliOffer extends FixedDeopsit {
	public DiwaliOffer(int accno,String name,double principle,int duration,FestivalType festival) {
		super(accno, name, principle, duration, festival);
	}
	
	@Override
	public float calculateRate() {
		return 8.0f;
	}
}
