package com.monocept.ocp.solution;

import com.monocept.ocp.solution.FestivalType;

public class FixedDeopsit {
	private int accno;
	private String name;
	private double principle;
	private int duration;
	private FestivalType festival;
	
	
	public FixedDeopsit (int accno,String name,double principle,int duration,FestivalType festival) {
		this.accno = accno;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}
	
	public int getAccno() {
		return accno ;
		
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrinciple() {
		return principle ;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public FestivalType getFestival() {
		return festival;
	}
	
	public double calculateSimpleIntrest() {
		return((this.principle* this.duration*this.calculateRate())/100);
	}
	
	public float calculateRate() {
		return 7.0f;
	}
}
