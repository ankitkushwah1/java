package com.monocept.ocp.solution;

import com.monocept.ocp.solution.*;

public class EidOffer extends FixedDeopsit{
	
	public EidOffer(int accno,String name,double principle,int duration,FestivalType festival) {
		super(accno, name, principle, duration, festival);
	}
	
	@Override 
	public float calculateRate() {
		return 7.5f;
	}
}
