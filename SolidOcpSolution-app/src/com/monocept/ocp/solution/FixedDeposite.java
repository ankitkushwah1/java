package com.monocept.ocp.solution;

public class FixedDeposite {
	private int accno;
	private String name;
	private double principle;
	private int duration;
	private IFestivalRatePolicy festival;
	
	
	public FixedDeposite(int accno,String name,double principle,int duration,IFestivalRatePolicy festival) {
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
	
	public IFestivalRatePolicy getFestival() {
		return festival;
	}
	
	public double calculateSimpleIntrest() {
		return((this.principle* this.duration*festival.calculateRate())/100);
	}
}
